package com.hillel.hrytsaienko.homeworks.homework8;

public class Homework8 {
    public static void main(String[] args) {
    int counter = 0;
    for (int i = 1; i <= 100; i++) {
        if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
            continue;
        }
        System.out.println("shuttle number = " + i);
        counter++;
    }
        System.out.println("count lucky shuttle = " + counter);
    }
}

