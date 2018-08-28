package com.chandler.zsk.dao;

import com.chandler.zsk.model.Comment;
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
public interface CommentDAO {

    String TABLE_NAME = " comment ";
    String INSERT_FIELDS = " content, user_id, entity_id, entity_type, create_date, status ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME ,"(",INSERT_FIELDS,
            ") values (#{content},#{userId},#{entityId},#{entityType},#{createDate},#{status})" })
    int addComment(Comment comment);

    @Select({"select ",SELECT_FIELDS," from ",TABLE_NAME," where id = #{id}"})
    Comment selectById(int id);

    @Update({"update ", TABLE_NAME, " set status = #{status} where entity_id = #{entityId} and entity_type=#{entityType}"})
    void updateStatus(@Param("entityId")int entityId,@Param("entityType")int entityType);

    @Delete({"delete from ", TABLE_NAME," where id = #{id}"})
    void deleteById(int id);
}
