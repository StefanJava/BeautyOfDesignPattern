package com.stefan.designpattern.oop.impl;

import com.stefan.designpattern.oop.Iterator;

public class Array implements Iterator {
    private String[] data;
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
