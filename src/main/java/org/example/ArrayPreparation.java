package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayPreparation {
    static Random random = new Random();

    public int[] arrayFillInt(){
        int[] array = new int[random.nextInt(10, 30)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 20);
        }
        return array;
    }

    public void arrayPrintInt(int[] array, boolean fl){
        if (fl){
            System.out.print("\tОтсортированный массив -> ");
            for (int j : array) {
                System.out.print(j + " ");
            }
        } else {
            System.out.print("\tМассив создан  - - - - -> ");
            for (int j : array) {
                System.out.print(j + " ");
            }
        }
    }

    public void arrayFillArrayList(ArrayList<Integer> array, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(99));
        }
    }

    public void arrayPrintArrayList(ArrayList<Integer> array,  boolean fl) {
        if (fl){
            System.out.print("\tОтсортированный массив -> ");
            Iterator<Integer> e = array.iterator();
            while (e.hasNext()) {
                System.out.print(e.next() + " ");
            }
        } else {
            System.out.print("\tМассив создан  - - - - -> ");
            Iterator<Integer> e = array.iterator();
            while (e.hasNext()) {
                System.out.print(e.next() + " ");
            }
        }
    }

}


