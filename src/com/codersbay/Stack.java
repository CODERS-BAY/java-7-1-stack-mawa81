package com.codersbay;

/*
Stack Class with methods: void push(), int size(), int peek(),int pop() & int[] pop(n)
created by Mario Wagner
on 06.03.2020
*/
public class Stack {
    int[] stack;

    public Stack() {
        stack = new int[0];
    }

    public void push(int newElement) {
        //inserts a new element at the top of the stack
        int[] temp = new int[stack.length + 1];
        for (int i = 0; i < stack.length; i++) {
            temp[i] = stack[i];
        }
        temp[stack.length] = newElement;
        stack = temp;
    }

    public int size() {
        //returns the number of elements in the stack
        return stack.length;
    }

    public int pop() {
        //returns the last element of the stack and removes it from the stack
        if (stack.length > 0) {
            int lastElement = stack[stack.length - 1];
            int[] temp = new int[stack.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
            return lastElement;
        } else {
            throw new IllegalArgumentException("StackTooSmallException");
        }
    }

    public int peek() {
        //returns the last element of the stack without modifying the stack
        if (stack.length > 0) {
            return stack[stack.length - 1];
        } else {
            throw new IllegalArgumentException("StackTooSmallException");
        }
    }

    public int[] pop(int n) {
        //returns the last n elements of the stack and removes them from the stack
        if (n >= 0 && stack.length - n >= 0) {
            int[] stackPart = new int[n];
            for (int j = 0, i = stack.length - 1; i >= stack.length - n; i--, j++) {
                stackPart[j] = stack[i];
            }
            int[] temp = new int[stack.length - n];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
            return stackPart;
        } else {
            throw new IllegalArgumentException("StackTooSmallException");
        }
    }
}
