package com.tutorial.design.pattern.factory;

public class EntryPoint {
    public static void main( String[] args ) {
        MotorVehicleFactory factory = new CarFactory();
        MotorVehicle car = factory.create();
    }
}
