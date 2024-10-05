package org.example.les2.sem2.task1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.printf("имя: %s; Возраст: %d\n%n", name, age);
    }
}
