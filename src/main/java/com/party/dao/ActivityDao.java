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
        return this.sessionFactory.openSession();
    }
    public int GetPage( String activityType,String activityState,String activityRelation,String peopleid){
        int recordCount=0,t1=0,t2=0;
        Session session=getCurrentSession();
        Query query;
        String hql1="select count(*) from ActivityInformation where( activityKind ='"+activityType+" 'or '所有'='"+activityType+"')and activityState='"+activityState+"'";
        String hql2="select count(*) from ActivityInformation a,Joinactivity b where( a.activityKind ='"+activityType+" ' or '所有'='"+activityType+" ')and a.activityState='"+activityState+"'and  a.activityId=b.activityiid and b.peopleiid='"+peopleid+"' ";
        if(activityRelation.equals("所有")){
            query = session.createQuery(hql1);
/*            query.setParameter(1, activityType);
            query.setParameter(2, activityType);
            query.setParameter(3, activityState);*/
        }
        else {
            query = session.createQuery(hql2);
/*            query.setParameter(1, activityType);
            query.setParameter(2, activityState);
            query.setParameter(3, peopleid);*/
        }
        Long aLong=(Long)query.uniqueResult();
        recordCount=aLong.intValue();
        t1=recordCount%6;
        t2=recordCount/6;
        if(t1 != 0){
            t2=t2+1;
        }
        session.close();
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
        String hql2=" from ActivityInformation a , Joinactivity b where( a.activityKind ='"+activityType+" ' or '所有'='"+activityType+" ')and a.activityState='"+activityState+"' and  a.activityId=b.activityiid and b.peopleiid='"+peopleid+"'  ";
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
        session.close();
        return activityInformationList;

    }
    public void flush() {
        getCurrentSession().flush();
    }
}
