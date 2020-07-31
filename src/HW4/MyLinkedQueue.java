package HW4;

public class MyLinkedQueue<T> {
    private MyLinkedList<T> queue = new MyLinkedList<>();

    public void insert(T item) {
        queue.insertFirst(item);
    }

    public T remove() {
        T item = queue.getLast();
        queue.deleteLast();
        return item;
    }

    public T peek() {
        T item = queue.getLast();
        return item;
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

}
