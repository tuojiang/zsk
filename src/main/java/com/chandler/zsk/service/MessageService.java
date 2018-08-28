package com.chandler.zsk.service;

import com.chandler.zsk.dao.MessageDAO;
import com.chandler.zsk.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: zsk
 * @Date: 2018/8/28
 * @Author: chandler
 * @Description:
 */
@Service
public class MessageService {
    @Autowired
    MessageDAO messageDAO;

    public void addMessage(Message message){
        messageDAO.addMessage(message);
    }
    public Message getMessageById(int id){
        return messageDAO.selectById(id);
    }
    public void deleteMessageById(int id){
        messageDAO.deleteById(id);
    }
}
