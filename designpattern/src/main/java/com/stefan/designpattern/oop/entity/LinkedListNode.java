package com.stefan.designpattern.oop.entity;

public class LinkedListNode {
    private Object val;
    private LinkedListNode next;

    public LinkedListNode(Object val) {
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    public Object getVal() {
        return this.val;
    }
    public void setNext(LinkedListNode next) {
        this.next = next;
    }
    public LinkedListNode getNext() {
        return this.next;
    }
}
