package org.example.les2.lec2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Car car1 = new Car("Audi");
        Class<?> car = Class.forName("Car");
        Constructor<?>[] constructors = car.getConstructors();
        System.out.println(constructors);

        System.out.println(car1);

        Object gaz = constructors[0].newInstance("GAZ");
    }
}
