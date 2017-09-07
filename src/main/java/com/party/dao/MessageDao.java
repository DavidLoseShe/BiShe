package com.party.dao;

import com.party.iDao.IMessageDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by guhao on 2017/8/24.
 */
@Repository
public class MessageDao implements IMessageDao {
    @Autowired
    private SessionFactory sessionFactory;
    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }
    @Override
    public int QueryMessageAmount(String id) {
        String hql="select count(*) from MessageInformation where messageState='未读' and messageReceiveId='"+id+"'";
        Session session = getCurrentSession();
        Query query = session.createQuery(hql);
/*        query.setParameter(1,id);*/
        Long aLong=(Long)query.uniqueResult();
        int MessageAmount=aLong.intValue();
        return MessageAmount;
    }
}
