package com.tutorial.decorator.design.pattern;

import java.text.MessageFormat;

public class EmailDecorator extends MessageDecorator {
    public EmailDecorator(Message message) {
        super(message);
    }
    @Override
    public void send(MessageEntity entity) {
        super.send(entity);
        email(entity);
    }
    private void email(MessageEntity entity) {
        System.out.println(MessageFormat.format("Email send successful, phone: {0}, msg: {1}\n", entity.getEmail(), entity.getMsg()));
    }
}
