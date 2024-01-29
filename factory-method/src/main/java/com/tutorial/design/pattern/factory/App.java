package com.tutorial.design.pattern.factory;

public class App {
    public static void main( String[] args ) {
        MotorVehicleFactory factory = new CarFactory();
        MotorVehicle car = factory.create();
        System.out.println("");
    }
}
