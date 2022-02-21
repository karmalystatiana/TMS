package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int a = 10;
        int b = 4;
        System.out.println("a +  b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a ++ = " + (a++));
        System.out.println("a -- = " + (a--));
        System.out.println("++a = " + (++a));
        System.out.println("--a = " + (--a));

        System.out.println("1 == 1 " + (1 == 1));
        System.out.println("1 != 1 " + (1 != 1));
        System.out.println("1 != 2 " + (1 != 2));
        System.out.println("1 < 2 " + (1 < 2));
        System.out.println("1 > 2 " + (1 > 2));

        System.out.println("1 & 1 = " + (1 & 1));
        System.out.println("1 | 1 = " + (1 | 1));
        System.out.println("1 ^ 1 = " + (1 ^ 1));
        System.out.println(" ~1 " + (~1));

        System.out.println((1 == 1) && (2 == 2));
        System.out.println((2 == 1) && (2 == 2));
        System.out.println((1 == 1) || (2 == 2));
        System.out.println((2 == 1) || (2 == 2));
        System.out.println(!(1 == 1));
        System.out.println(!(2 == 1));

        int c = 10;
        c += 5;
        System.out.println(c);
        c -= 3;
        System.out.println(c);
        c *= 2;
        System.out.println(c);
        c /= 2;
        System.out.println(c);

        int d = (c < a) ? 1 : 0;
        System.out.println(d);

    }
}
