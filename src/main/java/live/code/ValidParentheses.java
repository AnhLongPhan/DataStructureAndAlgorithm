package com.example.demo;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                default:
                    return false;  // Trường hợp đầu vào không hợp lệ
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();
        String s = "{[}";
        System.out.println(validator.isValid(s));  // Kết quả: true
    }
}
