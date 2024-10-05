package org.example.les3.sem3.task1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserData userData1 = new UserData("user1", 22, "1234");
        FileOutputStream fileOutputStream = new FileOutputStream("userdata.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(userData1);
        System.out.println("Объект userData1 сериализован");

        FileInputStream fileInputStream = new FileInputStream("userdata.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        userData1 = (UserData) objectInputStream.readObject();
        System.out.println("Объект userData1 десериализован");


        System.out.println("Имя: " + userData1.getName());
        System.out.println("Возраст: " + userData1.getAge());
        System.out.println("Пароль (должен быть null, т.к transient): " + userData1.getPassword());
    }

}
