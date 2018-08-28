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
public class Comment {
    private int id;
    private String content;
    private int userId;
    private int entityId;
    private int entityType;
    private Date createDate;
    private int status;

}
