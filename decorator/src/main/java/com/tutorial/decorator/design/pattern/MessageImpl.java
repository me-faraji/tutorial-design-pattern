package com.tutorial.decorator.design.pattern;

import java.text.MessageFormat;

public class MessageImpl implements Message {
    @Override
    public void send(MessageEntity entity) {
        System.out.println(MessageFormat.format("Sms send successful, email: {0}, msg: {1}\n", entity.getPhone(), entity.getMsg()));
    }
}
