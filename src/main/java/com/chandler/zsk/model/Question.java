package com.chandler.zsk.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: zsk
 * @Date: 2018/8/28
 * @Author: chandler
 * @Description:
 */
@Setter
@Getter
public class Question {
    private int id;
    private String title;
    private String content;
    private Date createdDate;
    private int userId;
    private int commentCount;
}
