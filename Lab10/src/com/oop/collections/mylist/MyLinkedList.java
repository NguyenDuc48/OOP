package com.oop.collections.mylist;

public class MyLinkedList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    private int size;
    private Object[] elements;

    public MyLinkedList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    public void enlarge() {
        Object[] temp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }

    @Override
    public void add(Object o, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size >= elements.length - 1) {
            enlarge();
        }
        size++;
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = o;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public int size() {
        return this.size;
    }
}
