package com.example.chatbot;

public class ChatsModel {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    private String message;
    private String sender;  //whether the bot or the user

    public ChatsModel(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }
//for handling data inside our recycler view -> make adapter class + 2 layout files (1) for user message 2) bots reply))

}
