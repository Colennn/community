package com.community.service;

import com.community.mapper.UserMapper;
import com.community.model.User;
import com.community.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService class
 *
 * @author: Administrator
 * @date: 2019/9/16 14:21
 * Description:
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void createOrUpdate(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAccountIdEqualTo(user.getAccountId());
        List<User> users = userMapper.selectByExample(userExample);
        User dbUser = users.get(0);
        if(dbUser == null){
            //插入
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            userMapper.insert(user);
        }else{
            //更新
            User updateUser = new User();
            updateUser.setGmtModified(System.currentTimeMillis());
            updateUser.setAvatarUrl(user.getAvatarUrl());
            updateUser.setName(user.getName());
            updateUser.setToken(user.getToken());
            UserExample example = new UserExample();
            example.createCriteria().andIdEqualTo(dbUser.getId());
            userMapper.updateByExampleSelective(updateUser, example);
        }
    }
}