package com.tutorial.design.pattern.factory;

import java.text.MessageFormat;

public class Car implements MotorVehicle {
    @Override
    public void build() {
        System.out.println(MessageFormat.format("{0} is created...", this.getClass().getSimpleName()));
    }
}
