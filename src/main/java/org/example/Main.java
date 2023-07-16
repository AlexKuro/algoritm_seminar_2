package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SortPyramid sortPyramid = new SortPyramid();
        ArrayPreparation arrayPreparation = new ArrayPreparation();
        ArrayList<Integer> array = new ArrayList<>();
        arrayPreparation.arrayFillArrayList(array, 20);
        System.out.println("\n\t - - - Пирамидальная сортировка - - - ");
        arrayPreparation.arrayPrintArrayList(array, false);
        sortPyramid.heapSort(array);
        System.out.println();
        arrayPreparation.arrayPrintArrayList(array, true);
        System.out.println();
    }
}