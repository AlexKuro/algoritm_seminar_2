package org.example;

import java.util.ArrayList;

public class SortPyramid {
    static void siftDown(ArrayList<Integer> array, int root, int bottom) {
        int maxChild = 0;
        boolean done = false;
        while ((root * 2 <= bottom) && (!done)) {
            if (root * 2 == bottom) {
                maxChild = root * 2;
            } else if (array.get(root * 2) > array.get(root * 2 + 1)) {
                maxChild = root * 2;
            } else {
                maxChild = root * 2 + 1;
            }
            if (array.get(root) < array.get(maxChild)) {
                int temp = array.get(root);
                array.set(root, array.get(maxChild));
                array.set(maxChild, temp);
                root = maxChild;
            } else {
                done = true;
            }
        }
    }

    public void heapSort(ArrayList<Integer> array) {
        int size = array.size();
        for (int i = (size / 2); i >= 0; i--) {
            siftDown(array, i, size - 1);
        }
        for (int i = size - 1; i >= 1; i--) {
            int temp = array.get(0);
            array.set(0, array.get(i));
            array.set(i, temp);
            siftDown(array, 0, i - 1);
        }
    }
}
