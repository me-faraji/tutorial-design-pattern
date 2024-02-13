package com.tutorial.decorator.design.pattern;

import java.text.MessageFormat;

public class TelegramDecorator extends MessageDecorator {
    public TelegramDecorator(Message message) {
        super(message);
    }

    @Override
    public void send(MessageEntity entity) {
        super.send(entity);
        telegram(entity);
    }

    private void telegram(MessageEntity entity) {
        System.out.println(MessageFormat.format("Telegram send successful, email: {0}, msg: {1}\n", entity.getTelegram(), entity.getMsg()));
    }
}
