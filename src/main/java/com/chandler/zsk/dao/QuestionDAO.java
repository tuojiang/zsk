package com.chandler.zsk.dao;

import com.chandler.zsk.model.Question;
import com.chandler.zsk.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @program: zsk
 * @Date: 2018/8/28
 * @Author: chandler
 * @Description:
 */
@Mapper
public interface QuestionDAO {

    String TABLE_NAME = " question ";
    String INSERT_FIELDS = " title, content, user_id, create_date, comment_count ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME ,"(",INSERT_FIELDS,
            ") values (#{title},#{content},#{createdDate},#{userId},#{commentCount})" })
    int addQuestion(Question question);

    @Select({"select ",SELECT_FIELDS," from ",TABLE_NAME," where id = #{id}"})
    Question selectById(int id);

    @Select({"select ",SELECT_FIELDS," from ",TABLE_NAME,
            " where user_id = #{userId} ORDER BY id DESC Limit #{offset},#{limit}"})
    List<Question> selectLatestQuestions(@Param("userId")int userId,@Param("offset")int offset,
                                         @Param("limit")int limit);
    @Update({"update ", TABLE_NAME, " set password = #{password} where id = #{id}"})
    void updateCommentCount(@Param("id")int id,@Param("commentCount")int commentCount);

    @Delete({"delete from ", TABLE_NAME," where id = #{id}"})
    void deleteById(int id);
}
