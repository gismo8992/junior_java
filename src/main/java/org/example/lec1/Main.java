package org.example.lec1;

public class Main {
    public static void main(String[] args) {
//        PlainInterface plainInterface = new PlainInterface() {
//            @Override
//            public String action(int x, int y) {
//                return String.valueOf(x+y);
//            }
//        };
        PlainInterface plainInterface = (x, y) -> String.valueOf(x + y);
        PlainInterface plainInterface1 = (x, y) -> {
            return String.valueOf(Integer.compare(x, y));
        };
        System.out.println(plainInterface.action(3, 4));
        System.out.println(plainInterface1.action(3, 4));

        IntInteface intInteface = (a, b) -> a * b;
        IntInteface intInteface1 = Integer::compare;
        System.out.println(intInteface.action1(3, 4));
    }
}