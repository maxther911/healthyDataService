package net.mrsistemas.healthy.data.facade.model;

import java.io.Serializable;

public class Message implements Serializable {
    Long codError = 0L;
    String messageType;
    String message = "OK";
    Object data = new Object();

    public Message(Long codError, String messageType, String message) {
        this.codError = codError;
        this.messageType = messageType;
        this.message = message;
    }

    public Message(Long codError, String messageType, String message, Object data) {
        this.codError = codError;
        this.messageType = messageType;
        this.message = message;
        this.data = data;
    }

    public Long getCodError() {
        return codError;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
