package com.chandler.zsk.service;

import com.chandler.zsk.dao.UserDAO;
import com.chandler.zsk.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: zsk
 * @Date: 2018/8/28
 * @Author: chandler
 * @Description:
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    UserDAO userDAO;

    public void addUser(User user){
        userDAO.addUser(user);
    }

    public User getUserById(int id){
        return userDAO.selectById(id);
    }

    public void deleteUserById(int id){
        userDAO.deleteById(id);
    }

    public void updateUser(User user){
        userDAO.updatePassword(user);
    }
}
