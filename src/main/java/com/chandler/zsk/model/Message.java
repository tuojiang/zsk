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
@Getter
@Setter
public class Message {
    private int id;
    private int fromId;
    private int toId;
    private String content;
    private int hasRead;
    private String conversationId;
}
