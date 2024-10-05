package org.example.les2.hw2;

import java.lang.reflect.Method;

/**
 * Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.
 */
public class Task1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> stringClass = Class.forName("java.lang.String");
        Method[] methods = stringClass.getMethods();
        for (Method method: methods
             ) {
            System.out.println("Метод: " + method.getName());
        }
    }
}
