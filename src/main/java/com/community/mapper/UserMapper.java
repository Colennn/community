package com.community.mapper;

import com.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper class
 *
 * @author: Administrator
 * @date: 2019/9/7 12:45
 * Description:
 */
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user(name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

}
