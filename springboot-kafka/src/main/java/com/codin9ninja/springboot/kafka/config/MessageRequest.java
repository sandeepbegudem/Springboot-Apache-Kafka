package com.codin9ninja.springboot.kafka.config;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class MessageRequest {

    private String message;

    public MessageRequest(){

    }
    public MessageRequest(String message){
        this.message = message;

    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
