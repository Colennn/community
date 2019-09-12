package com.community.dto;

import lombok.Data;

/**
 * GithubUser class
 *
 * @author: Administrator
 * @date: 2019/9/1 15:50
 * Description:
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
