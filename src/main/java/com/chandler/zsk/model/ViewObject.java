package com.chandler.zsk.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: zsk
 * @Date: 2018/8/28
 * @Author: chandler
 * @Description:
 */
public class ViewObject {
    private Map<String,Object> objs = new HashMap<>();
    public void set(String key,Object value){
        objs.put(key,value);
    }
    public Object get(String key){
        return objs.get(key);
    }
}
