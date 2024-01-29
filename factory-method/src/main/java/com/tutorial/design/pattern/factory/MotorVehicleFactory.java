package com.tutorial.design.pattern.factory;

public abstract class MotorVehicleFactory {
    public MotorVehicle create() {
        MotorVehicle motorVehicle = createMotorVehicle();
        motorVehicle.build();
        return motorVehicle;
    }

    protected abstract MotorVehicle createMotorVehicle();
}
