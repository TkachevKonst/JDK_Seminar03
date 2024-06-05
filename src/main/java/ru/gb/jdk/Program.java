package ru.gb.jdk;

import ru.gb.jdk.Task1.Calculator;
import ru.gb.jdk.Task2.MyArray;
import ru.gb.jdk.Task3.Pair;

public class Program {

    public static void main(String[] args) {
        System.out.println(Calculator.divide(1.5, 2));

        Integer[] arr1 = {1,2,3,5,6};
       Integer[] arr2 = {11,2,5,8,9};
       String[] strings = {"d","h","h","f"};
       String[] strings1 = {"3","j","hflkgjh" ,"o"};

       System.out.println(MyArray.compareArrays(arr1,arr2));
       System.out.println(MyArray.compareArrays(arr1,strings));
       System.out.println(MyArray.compareArrays(strings1,strings));

//        Pair pair = new Pair(1, "test");
//        Pair pair2 = new Pair(2.55, "test2");
//        Pair pair3 = new Pair("test3", "second");
//        Pair pair4 = new Pair("test3", 100);
//
//
//        System.out.println(pair);
//        System.out.println(pair2);
//        System.out.println(pair3);
//        System.out.println(pair4);

    }


}
