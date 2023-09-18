package com.example.arraystack;

public class ArrayStack implements Stack {
    private int[] array;
    private int size;

    // Constructor to initialize the stack
    public ArrayStack() {
        array = new int[100];
        size = 0;
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param e the element to be pushed onto the stack
     */
    public void push(int e) {
            array[size] = e;
            size++;
            System.out.println("-");
    }

    /**
     * Removes and returns the element at the top of the stack.
     * @return the element at the top of the stack
     */
    public int pop() {
        if (!isEmpty()) {
            int topElement = array[size - 1];
            size--;
            return topElement;
        } else {
            return -1;
        }
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * @return the element at the top of the stack
     */
    public int top() {
            return array[size - 1];
    }

    /**
     * Returns the number of elements in the stack.
     * @return the number of elements in the stack
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the string when you print the stack elements.
     * @return the string starting from the bottom element to the top element.
     */
    public String toString() {
        StringBuilder result = new StringBuilder("(");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append(")");
        return result.toString();
    }
}
