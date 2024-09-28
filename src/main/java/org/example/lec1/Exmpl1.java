package org.example.lec1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exmpl1 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Go", "Bye");

        // stream делает массив потоком
        // filter конвеерный и возвращает стрим
        list1 = list1.stream().filter(str -> str.length() > 1).collect(Collectors.toList());
        for (String item: list1
             ) {
            System.out.println(item);
        }

        List<String> list2 = Arrays.asList("Hiiiii", "Goooo", "Byeee");

        // stream() делает массив потоком
        // filter конвейерный и возвращает стрим
        list2.stream().filter(str -> str.length() > 4).forEach(System.out::println);
        list2.stream().filter(str -> str.length()>4).filter(str->str.contains("o")).forEach(System.out::println);

        // map преобразует одно число в другое число
        Arrays.asList(1,2,3,4,5).stream().map(number -> "число =" + number + ", квадрат числа =" + number*number).forEach(System.out::println);
        Arrays.asList(1,10,0,2,4).stream().sorted().forEach(System.out::println);
        Arrays.asList(1,10,10,0,2, 4,4).stream().distinct().sorted().forEach(System.out::println);

        List<User> users = Arrays.asList(new User("Alex", 14), new User("Anna", 23), new User("Andrew", 22));
        users.stream().map(user -> new User(user.getName(), user.getAge()-5)).filter(user -> user.getAge() >= 15).forEach(System.out::println);
    }
}
