package com.tutorial.decorator.design.pattern;

import java.text.MessageFormat;

public abstract class MessageDecorator implements Message {
    Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public void send(MessageEntity entity) {
        message.send(entity);
    }
}
