package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        within10and20(5,7);
        isNegativeOrPositive(4);
        isNegative(3);
        lineTimes("Сложный",2);
        year(800);
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum<=20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isNegativeOrPositive(int a){
        if (a>=0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean isNegative(int a){
        if (a<0){
            return true;
        } else {
            return false;
        }
    }

    public static void lineTimes(String line, int a) {
        for (int i=0; i<a; i++) {
            System.out.println(line);
        }
    }

    public static boolean year(int a){
        int multiple400 = a % 400;
        int multiple100 = a % 100;
        int multiple4 = a % 4;
        if (multiple400 == 0) {
            return true;
        } else if (multiple100 == 0 ) {
            return false;
        } else if (multiple4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}