package com.oop.collections.mymap;

public class MyHashMap implements MyMap {
    final static int INITIAL_SIZE = 8;
    MyHashMapEntry[] table;
    int size = 0;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
    }

    @Override
    public Object get(Object key) {

        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    @Override
    public void put(Object key, Object value) {
        if (capacityRaito() > 0.6) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    void enlarge() {
        MyHashMapEntry[] temp = new MyHashMapEntry[table.length * 2];
        System.arraycopy(table, 0, temp, 0, table.length);
        table = temp;
    }

    double capacityRaito() {
        return size / (double) table.length;
    }

    @Override
    public void remove(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            table[bucket] = null;
            size--;
        }
    }

    @Override
    public boolean contains(Object key) {
        int bucket = getBucket(key);
        return table[bucket] != null;
    }

    @Override
    public int size() {
        return this.size;
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s,%s)\n", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }
}