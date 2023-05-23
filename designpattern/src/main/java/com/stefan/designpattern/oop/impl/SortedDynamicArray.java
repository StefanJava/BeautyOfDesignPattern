package com.stefan.designpattern.oop.impl;

public class SortedDynamicArray extends DynamicArray {
    @Override
    public void add(int e) {
        ensureCapacity();
        int i;
        for (i = this.size - 1; i >= 0; i--) {
            if (elements[i] > e) {
                elements[i + 1] = elements[i];
            } else {
                break;
            }
        }
        elements[i + 1] = e;
        size++;
    }

    public static void test(DynamicArray dynamicArray) {
        dynamicArray.add(5);
        dynamicArray.add(1);
        dynamicArray.add(3);
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new SortedDynamicArray();
        test(dynamicArray);
    }
}
