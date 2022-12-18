package com.oop.collections.mylist;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o, int index) {
        size++;
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = o;

    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return elements[index];
        }
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}