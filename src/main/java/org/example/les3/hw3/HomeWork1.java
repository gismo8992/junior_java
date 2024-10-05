package org.example.les3.hw3;

import java.io.*;

public class HomeWork1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("Ivan", 20);
        FileOutputStream fileOutputStream = new FileOutputStream("my_user_data.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person1);
        System.out.println("Объект userData1 сериализован");

        FileInputStream fileInputStream = new FileInputStream("my_user_data.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        person1 = (Person) objectInputStream.readObject();
        System.out.println("Объект userData1 десериализован");

        System.out.println("Имя: " + person1.getName());
        System.out.println("Возраст: " + person1.getAge());

    }
}
