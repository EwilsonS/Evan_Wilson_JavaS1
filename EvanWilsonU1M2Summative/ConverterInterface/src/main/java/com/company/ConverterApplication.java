package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf month = new ConverterIf();
        ConverterSwitch week = new ConverterSwitch();

        System.out.println(month.convertMonth(12));
        System.out.println(week.convertDay(7));
    }
}
