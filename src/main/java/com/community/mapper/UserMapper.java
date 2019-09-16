package com.community.mapper;

import com.community.model.User;
import org.apache.ibatis.annotations.*;

/**
 * UserMapper class
 *
 * @author: Administrator
 * @date: 2019/9/7 12:45
 * Description:
 */
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user(name,account_id,token,gmt_create,gmt_modified, avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("SELECT * FROM user WHERE token=#{token}")
    User findByToken(@Param("token") String token);

    @Select("SELECT * FROM user WHERE id=#{id}")
    User findById(@Param("id") Integer id);

    @Select("SELECT * FROM user WHERE account_id=#{accountId}")
    User findByAccount(@Param("accountId") String accountId);

    @Update("update user set name=#{name},token=#{token},gmt_modified=#{gmtModified},avatar_url=#{avatarUrl} where id = #{id}")
    void update(User user);
}
