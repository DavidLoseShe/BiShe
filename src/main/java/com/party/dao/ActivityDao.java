package com.party.dao;

import com.party.entity.ActivityInformation;
import com.party.iDao.IActivityDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guhao on 2017/8/23.
 */
@Repository
public class ActivityDao implements IActivityDao{
    @Autowired
    private SessionFactory sessionFactory;
    private Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    public int GetPage( String activityType,String activityState,String activityRelation,String peopleid){
        int recordCount=0,t1=0,t2=0;
        Session session=getCurrentSession();
        Query query;
        String hql1="select count(*) from ActivityInformation where( activityKind ='"+activityType+" 'or '所有'='"+activityType+"')and activityState='"+activityState+"'";
        String hql2="select count(*) from ActivityInformation a,JoinActivity b where( a.activityKind ='"+activityType+" ' or '所有'='"+activityType+" ')and a.activityState='"+activityState+"'and  a.activityId=b.activityiid and b.peopleiid='"+peopleid+"' ";
        if(activityRelation.equals("所有")){
            query = session.createQuery(hql1);
        }
        else {
            query = session.createQuery(hql2);
        }
        Long aLong=(Long)query.uniqueResult();
        recordCount=aLong.intValue();
        t1=recordCount%6;
        t2=recordCount/6;
        if(t1 != 0){
            t2=t2+1;
        }
        return t2;
    }

    public List<ActivityInformation> QueryActivityInfo(int pageNo,String activityType,String activityState,String activityRelation,String peopleid){
        List activityInformationList=new ArrayList<ActivityInformation>();
        List<Object[]> list;
        int pageSize=6;
        int page=(pageNo-1)*6;
        Session session= getCurrentSession();
        Query query;
        String hql ="from ActivityInformation a  where( a.activityKind ='"+activityType+" ' or '所有'='"+activityType+" ')and a.activityState='"+activityState+"'";
        String hql2=" from ActivityInformation a , JoinActivity b where( a.activityKind ='"+activityType+" ' or '所有'='"+activityType+" ')and a.activityState='"+activityState+"' and  a.activityId=b.activityiid and b.peopleiid='"+peopleid+"'  ";
        if(activityRelation.equals("所有")){
            query = session.createQuery(hql);

            query.setFirstResult(page);
            query.setMaxResults(pageSize);
            activityInformationList=query.list();
        }
        else {
            query = session.createQuery(hql2);
            query.setFirstResult(page);
            query.setMaxResults(pageSize);
            list=query.list();
            for (Object[] objects :list){
                ActivityInformation activityInformation=null;
                activityInformation=(ActivityInformation)objects[0];
                activityInformationList.add(activityInformation);
            }

        }
        return activityInformationList;

    }

    @Override
    public List<ActivityInformation> AdminQueryActivityInfoList() {
        Session session=getCurrentSession();
        Query query=   session.createQuery("from ActivityInformation");
        List<ActivityInformation> activityInformationList =query.list();
        return activityInformationList;
    }
    //QI
    public List<ActivityInformation> QueryPersonActivityInfo(String studentId) {
        Session session=getCurrentSession();
        Query query=session.createQuery("from ActivityInformation where studentId='"+studentId+"'");
        List<ActivityInformation> activityInformationList= query.list();
        return activityInformationList;
    }
    public void flush() {
        getCurrentSession().flush();
    }
}
