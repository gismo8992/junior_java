package org.example.les3.sem3.task1;

import java.io.Serializable;

public class UserData implements Serializable {
    private String name;
    private int age;
    transient String password; // не должен храниться в сериализованном виде

    public UserData(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}
