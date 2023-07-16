package org.example;

import java.util.concurrent.atomic.*;

public class SortBubble {
    public AtomicInteger counter1 = new AtomicInteger();

    public void sortBubble(int[] array) {
        boolean fl = true;
        do {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        fl = false;
                    }
                    counter1.getAndIncrement();
                }
            }
        } while (fl);
    }


}
