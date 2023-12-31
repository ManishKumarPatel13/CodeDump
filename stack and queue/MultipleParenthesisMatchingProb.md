 ```
# Multiple Parenthesis Matching

This Java program implements a stack data structure to check if a given expression has valid parentheses. The program uses a stack to store the opening parentheses and pops them when a closing parenthesis is encountered. If the stack is empty when a closing parenthesis is encountered, then the expression is invalid. If the stack is not empty when all the parentheses have been processed, then the expression is also invalid.

## How to use

To use the program, create a stack object and push the opening parentheses onto the stack. When you encounter a closing parenthesis, pop the top element from the stack and compare it to the closing parenthesis. If the two parentheses match, then continue. If the two parentheses do not match, then the expression is invalid.

After you have processed all the parentheses, check if the stack is empty. If the stack is empty, then the expression is valid. If the stack is not empty, then the expression is invalid.

## Code

The following code implements the stack data structure and the parenthesis matching algorithm:

```java
public class Multiple_parenthesis_Matching {
    public static class stack {
        public int top;
        public int size;
        public char[] arr;

        stack(int s) {
            this.size = s;
            this.arr = new char[s];
        }

        public void push(char key) {
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

        public boolean isEmpty() {
            if (top == -1) {
                

Generated by [BlackboxAI](https://www.useblackbox.ai)