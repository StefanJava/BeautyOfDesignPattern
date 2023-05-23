package com.stefan.designpattern.oop.impl;

import com.stefan.designpattern.oop.Iterator;
import com.stefan.designpattern.oop.entity.LinkedListNode;

public class LinkedList implements Iterator {
    private LinkedListNode head;
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    @Override
    public String remove() {
        return null;
    }
}
