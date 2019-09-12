package com.community.dto;

import lombok.Data;

/**
 * AcessTokenDTO class
 *
 * @author: Administrator
 * @date: 2019/9/1 12:36
 * Description:
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
