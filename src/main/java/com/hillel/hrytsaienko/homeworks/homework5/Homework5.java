package com.hillel.hrytsaienko.homeworks.homework5;

public class Homework5 {
    public static void main (String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int horsemanLi = 46;

        int warriorMin = 9;
        int archerMin = 35;
        int horsemanMin = 12;

        int sumLi = (warriorLi + archerLi + horsemanLi) * 890;
        double sumMin = ((warriorMin + archerMin + horsemanMin) * 890) * 1.5;
        System.out.println("The total attacks of Li's army = " +sumLi);
        System.out.println("The total attacks of Min's army = " +sumMin);
    }
}
