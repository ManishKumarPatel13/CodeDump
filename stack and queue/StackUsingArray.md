 ```
# Stack in Java

This repository contains Java code for implementing stack and queue data structures using arrays and linked lists. 

## Stack using Array

A stack is a linear data structure that follows the last-in-first-out (LIFO) principle. In Java, we can implement a stack using an array as follows:

```java
public class StackUsingArray {
    stack s;

    public static class stack {
        public int top;
        public int size;
        public int[] arr;

        stack(int s) {
            this.size = s;
            this.arr = new int[s];
        }

        public void push(int key) {
            if (top == size) {
                System.out.println("Stack is full");
                return;
            }
            arr[top + 1] = key;
            top = top + 1;
        }

        public int pop() {
            int pop_value;
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            pop_value = arr[top];
            top -= 1;
            return pop_value;
        }

        public void printStack() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " <-- ");
            }
        }

        public void isEmpty() {
            if (top == -1) {
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
        }

        public void isFull() {
            if (top == size) {
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
        }

        public void spaceLeft() {
            System.out.println(size - top);
        }
  
        public void getIndex(int key) {
            for (int i = 0; i <= top; i++) {
                if (arr[i] == key) {


Generated by [BlackboxAI](https://www.useblackbox.ai)