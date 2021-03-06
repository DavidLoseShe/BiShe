package com.party.service;

import com.party.dao.MessageDao;
import com.party.iService.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by guhao on 2017/8/24.
 */
@Service
@Transactional
public class MessageService implements IMessageService{
    @Autowired
    private MessageDao messageDao;

    @Override
    public int QueryMessageAmountService(String id) {
        return  messageDao.QueryMessageAmount(id);
    }
}
