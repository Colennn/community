package com.community.dto;

import com.community.model.User;
import lombok.Data;

/**
 * QuestionDTO class
 *
 * @author: Administrator
 * @date: 2019/9/10 14:02
 * Description:
 */
@Data
public class QuestionDTO {
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
    private User user;
}
