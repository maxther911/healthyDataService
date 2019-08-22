package net.mrsistemas.healthy.data.facade.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class Message implements Serializable {

    @Getter @Setter
    Long codError = 0L;
    @Getter @Setter
    String messageType;
    @Getter @Setter
    String message = "OK";
    @Getter @Setter
    Object data = new Object();

    public Message(Long codError, String messageType, String message) {
        this.codError = codError;
        this.messageType = messageType;
        this.message = message;
        this.data = null;
    }

    public Message(Long codError, String messageType, String message, Object data) {
        this.codError = codError;
        this.messageType = messageType;
        this.message = message;
        this.data = data == null ? new Object() : data;
    }
}
