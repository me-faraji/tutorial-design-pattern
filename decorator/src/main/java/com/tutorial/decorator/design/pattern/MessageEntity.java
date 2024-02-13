package com.tutorial.decorator.design.pattern;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageEntity {
    private String phone;
    private String email;
    private String telegram;
    private String msg;
}
