package HW3;

import java.util.EmptyStackException;

public class MyDeque<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int right = 0;
    private int left = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }


    public void insertRight(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        list[size - 1] = item;
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        size++;
        for (int i = size - 1; i > 0 ; i--) {
            list[i] = list[i - 1];
        }
        list[0] = item;
    }

    public T removeRight() {
        T value = peekRight();
        right = size - 1;
        size--;
        list[right] = null;
        return value;
    }

    public T removeLeft() {
        T value = peekLeft();
        for (int i = 0; i < size; i++) {
            list[i] = list[i + 1];
        }
        size--;
        return value;
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[0];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                sb.append(list[i]).append(", ");
            }
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}
