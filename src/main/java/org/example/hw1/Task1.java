package org.example.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,14,16));
        System.out.println(list.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).summaryStatistics().getAverage());

        //проверка
        int sum = 0;
        int count =0;
        for (int a: list
             ) {
            if (a %2 == 0) {
                sum += a;
                count++;
            }
        }
        double average = (double) sum /count;
        System.out.println(average);
    }
}
