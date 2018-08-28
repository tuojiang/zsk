package com.chandler.zsk.service;

import com.chandler.zsk.dao.CommentDAO;
import com.chandler.zsk.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: zsk
 * @Date: 2018/8/28
 * @Author: chandler
 * @Description:
 */
@Service
public class CommentService {
    @Autowired
    CommentDAO commentDAO;

    public void addComment(Comment comment){
        commentDAO.addComment(comment);
    }
    public Comment getCommentById(int id){
        return commentDAO.selectById(id);
    }

    public void updateComment(int entityId,int entityType){
        commentDAO.updateStatus(entityId,entityType);
    }
    public void deleteComment(int id){
        commentDAO.deleteById(id);
    }
}
