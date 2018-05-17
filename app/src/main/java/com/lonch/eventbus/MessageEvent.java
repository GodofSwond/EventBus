package com.lonch.eventbus;

/**
 * Created by SwordGod on 2018/5/17.
 * 项目描述：
 * 邮箱：156690858@qq.com
 */

public class MessageEvent {

    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
