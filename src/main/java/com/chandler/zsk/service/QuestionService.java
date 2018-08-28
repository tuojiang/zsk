package com.chandler.zsk.service;

import com.chandler.zsk.dao.QuestionDAO;
import com.chandler.zsk.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: zsk
 * @Date: 2018/8/28
 * @Author: chandler
 * @Description:
 */
@Service
public class QuestionService {

    @Autowired
    QuestionDAO questionDAO;

    public void addQuestion(Question question){
        questionDAO.addQuestion(question);
    }
    public Question getQuesetion(int id){
        return questionDAO.selectById(id);
    }
    public List<Question> getQuestions(int userId,int offset,int limit){
        return questionDAO.selectLatestQuestions(userId,offset,limit);
    }
    public void updateQuestion(int id,int commentCount){
        questionDAO.updateCommentCount(id,commentCount);
    }
    public void deleteQuestion(int id){
        questionDAO.deleteById(id);
    }
}
