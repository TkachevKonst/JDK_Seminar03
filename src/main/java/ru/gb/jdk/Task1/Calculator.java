package ru.gb.jdk.Task1;

/**
 * Написать класс Калькулятор (необобщенный),
 * который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 * Методы должны возвращать результат своей работы.
 */


public class Calculator {

    public static <T extends Number> void sum(T a, T b) {
        System.out.println(a.doubleValue() + b.doubleValue());
    }

    public static <T extends Number> void  subtract (T a, T b){
        System.out.println(a.doubleValue() - b.doubleValue());
    }

    public static <T extends Number> void multiply (T a, T b){
        System.out.println(a.doubleValue() * b.doubleValue());
    }


    public static <T extends Number> void divide (T a, T b){
        if(b.equals(0)){
            System.out.println("Деление на ноль не возможно");
        }else System.out.println(a.doubleValue() / b.doubleValue());
    }


}
