package com.example.demo;

import java.util.Stack;

class MaxStack {
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    // Phương thức đẩy phần tử lên ngăn xếp
    public void push(int x) {
        stack.push(x);
        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        } else {
            maxStack.push(maxStack.peek());
        }
    }

    // Phương thức lấy phần tử trên đỉnh ngăn xếp và trả về nó
    public int pop() {
        maxStack.pop();
        return stack.pop();
    }

    // Phương thức lấy phần tử trên đỉnh ngăn xếp mà không loại bỏ nó
    public int top() {
        return stack.peek();
    }

    // Phương thức lấy phần tử lớn nhất trong ngăn xếp mà không loại bỏ nó
    public int peekMax() {
        return maxStack.peek();
    }

    // Phương thức lấy phần tử lớn nhất trong ngăn xếp và loại bỏ nó
    public int popMax() {
        int max = peekMax();
        Stack<Integer> buffer = new Stack<>();

        // Đẩy các phần tử lên buffer cho đến khi gặp phần tử lớn nhất
        while (top() != max) {
            buffer.push(pop());
        }

        // Loại bỏ phần tử lớn nhất
        pop();

        // Đẩy các phần tử từ buffer trở lại ngăn xếp chính
        while (!buffer.isEmpty()) {
            push(buffer.pop());
        }

        return max;
    }
}

