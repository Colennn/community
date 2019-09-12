package com.community.model;

import lombok.Data;

/**
 * Question class
 *
 * @author: Administrator
 * @date: 2019/9/9 11:16
 * Description:
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;

}
