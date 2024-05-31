package com.example.chatbot;
//storing res from chat bot
public class MsgModel {
    public MsgModel(String cnt) {
        this.cnt = cnt;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    private String cnt;
}
