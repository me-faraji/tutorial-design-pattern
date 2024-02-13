package com.tutorial.decorator.design.pattern;

public class MessageService {
    public static void main(String[] args) {
        new TelegramDecorator(new EmailDecorator(new MessageImpl())).send(MessageEntity.builder()
                .phone("09379644267")
                .email("me.faraji67@gmail.com")
                .telegram("ayhan.telegram.com")
                .msg("decorator to test").build());
    }
}