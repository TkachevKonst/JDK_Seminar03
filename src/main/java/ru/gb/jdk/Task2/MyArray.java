package ru.gb.jdk.Task2;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
 * если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
 * но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
 */

public class MyArray {

    public static <T, V> boolean compareArrays(T[] arr1, V[] arr2) {

        int count = 0;
        if ( arr1!=null && arr2!=null && arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].getClass() == arr2[i].getClass()){
                    count++;
                }
            }
            if (count == arr1.length) return true;
        }
        return false;
    }


}
