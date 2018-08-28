package com.chandler.zsk.dao;

import com.chandler.zsk.model.Message;
import com.chandler.zsk.model.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: zsk
 * @Date: 2018/8/28
 * @Author: chandler
 * @Description:
 */
@Mapper
public interface MessageDAO {

    String TABLE_NAME = " message ";
    String INSERT_FIELDS = " from_id, to_id, content, create_date, has_read,conversation_id ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME ,"(",INSERT_FIELDS,
            ") values (#{fromId},#{toId},#{content},#{hasRead},#{conversationId})" })
    int addMessage(Message message);

    @Select({"select ",SELECT_FIELDS," from ",TABLE_NAME," where id = #{id}"})
    Message selectById(int id);


    @Delete({"delete from ", TABLE_NAME," where id = #{id}"})
    void deleteById(int id);
}
