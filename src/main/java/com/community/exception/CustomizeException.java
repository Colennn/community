package com.community.exception;

/**
 * CustomizeException class
 *
 * @author: Administrator
 * @date: 2019/9/17 16:01
 * Description:
 */
public class CustomizeException extends RuntimeException{
    private String massage;

    public CustomizeException(CustomizeErrorCode message) {
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }
}
