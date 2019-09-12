package com.community.model;

import lombok.Data;

/**
 * User class
 *
 * @author: Administrator
 * @date: 2019/9/7 12:52
 * Description:
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String bio;
    private String avatarUrl;
}
