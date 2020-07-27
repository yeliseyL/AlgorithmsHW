package HW2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> malSelSorted = randomIntArrayList();
        long start = System.currentTimeMillis();
        malSelSorted.selectionSort();
        long end = System.currentTimeMillis();
        System.out.printf("Selection sort time: %d%n", end - start);

        MyArrayList<Integer> malInsSorted = randomIntArrayList();
        start = System.currentTimeMillis();
        malInsSorted.insertionSort();
        end = System.currentTimeMillis();
        System.out.printf("Insertion sort time: %d%n", end - start);

        MyArrayList<Integer> malBubSorted = randomIntArrayList();
        start = System.currentTimeMillis();
        malBubSorted.bubbleSort();
        end = System.currentTimeMillis();
        System.out.printf("Bubble sort time: %d%n", end - start);

    }

    public static MyArrayList<Integer> randomIntArrayList() {
        MyArrayList<Integer> mal = new MyArrayList<>(100000);
        Random rand = new Random();
        for (int i = 0; i < 100000; i++) {
            mal.add(rand.nextInt(100000));
        }
        return mal;
    }
}
