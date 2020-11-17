package org.sedgewick.algorithms.structures;

import java.util.NoSuchElementException;

public class MaxPQ<Key extends Comparable<Key>> {
    private final Key[] values;
    private int size;

    public MaxPQ(int size) {
        this.values = (Key[]) new Comparable[size + 1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(Key key){
        if (size == values.length) throw new NoSuchElementException();
        values[++size] = key;
        up(size);
    }

    public Key delete(){
        if (size == 0) throw new NoSuchElementException();
        Key max = values[1];
        swap(1, size);
        values[size--] = null;
        down(1);
        return max;
    }

    private void up(int i){
        while (i > 1 && less(values[i/2], values[i])){
            swap(i/2, i);
            i = i/2;
        }
    }

    private void down(int i){
        int j;
        while (2*i <= size){
            j = 2*i;
            if (j < size && less(j, j+1)) j++;
            if (!less(values[i], values[j])) break;
            swap(i, j);
            i = j;
        }
    }

    private boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private void swap(int a, int b) {
        Key tmp = values[a];
        values[a] = values[b];
        values[b] = tmp;
    }
}
