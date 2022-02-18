package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);


        String number = sc.next("user");

        System.out.println("Спасибо! Вы ввели число " + number);

        sc.close();//вот теперь мы сделали все правильно!

    }
}
