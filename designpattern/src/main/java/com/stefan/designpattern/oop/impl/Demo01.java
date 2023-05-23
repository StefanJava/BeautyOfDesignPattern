package com.stefan.designpattern.oop.impl;

import com.stefan.designpattern.oop.Iterator;

public class Demo01 {
    private static void print(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Iterator arrayIterator = new Array();
        print(arrayIterator);

        Iterator linkedListIterator = new LinkedList();
        print(linkedListIterator);
    }
}
