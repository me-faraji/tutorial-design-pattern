package com.tutorial.design.pattern;

import com.tutorial.design.pattern.factory.CarFactory;
import com.tutorial.design.pattern.factory.MotorVehicle;
import com.tutorial.design.pattern.factory.MotorVehicleFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryMethodUnitTest {
    @Test
    public void givenCarFactory_whenCreateMotorVehicle_thenInstanceOf() {
        MotorVehicleFactory factory = new CarFactory();
        MotorVehicle car = factory.create();
        Assertions.assertInstanceOf(MotorVehicle.class, car);
    }
}
