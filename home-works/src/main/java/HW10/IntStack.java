 package HW10;

import java.util.EmptyStackException;

public class IntStack {
    private int[] data;
    private int size;

    public IntStack(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public void push(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        return data[--size];
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return data[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
}

