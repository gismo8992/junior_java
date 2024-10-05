package org.example.les2.sem2.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Programm {
    /**
     * Задача 1: Основы Reflection API
     * ===============================
     * Получите инфо о классе Person с используя Reflection API
     * выведите на экран все поля и методы класса
     * создайте экземпляр класса Person с используя Reflection API
     * установите значение полей и вызовите методы
     * Реализуйте обработки исключений для корректного взаимодейтсвия с Reflection API
     */
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Class<?> personalClass = Class.forName("org.example.les2.sem2.task1.Person");
        // получить список всех полей
        Field[] fields = personalClass.getDeclaredFields();
        for (Field field: fields
             ) {
            System.out.println("Поле: " + field.getName());
        }

        // получить список всех конструкторов
        Constructor[] constructors = personalClass.getConstructors();

        // создадим экземпляр класса
        Object personInstance = constructors[0].newInstance("Alex", 23);
        Field nameField = personInstance.getClass().getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(personInstance, "Alice");

        Method displayInfoMethod = personalClass.getDeclaredMethod("displayInfo");
        displayInfoMethod.invoke(personInstance);

    }
}
