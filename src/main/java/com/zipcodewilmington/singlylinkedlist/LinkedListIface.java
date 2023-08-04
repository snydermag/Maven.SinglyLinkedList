package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

public interface LinkedListIface <T extends Comparable<T> > {

    void add(T data);
    void remove(int index) throws IndexOutOfBoundsException;
    T get(int index) throws IndexOutOfBoundsException;
    boolean contains(T data);
    int find(T data);

    int size();
    SinglyLinkedList<T> copy();

    void sort();

}
