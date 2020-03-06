package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack();

        System.out.println("Stack: " + Arrays.toString(myStack.stack));
        myStack.push(-4);
        myStack.push(2);
        myStack.push(7);
        myStack.push(53);
        myStack.push(10000);

        System.out.println(myStack.peek());
        System.out.println(Arrays.toString(myStack.stack));
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println("size = " + myStack.size());
        System.out.println(Arrays.toString(myStack.stack));
        int[] temp = myStack.pop(2);
        System.out.println("n Array: " + Arrays.toString(temp));
        System.out.println("Stack: " + Arrays.toString(myStack.stack));

    }
}
