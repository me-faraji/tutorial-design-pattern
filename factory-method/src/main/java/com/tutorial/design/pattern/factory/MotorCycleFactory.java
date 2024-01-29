package com.tutorial.design.pattern.factory;

public class MotorCycleFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new MotorCycle();
    }
}
