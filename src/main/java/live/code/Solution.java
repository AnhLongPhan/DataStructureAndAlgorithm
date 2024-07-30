package com.example.demo;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String inp = "({[}])";
        Solution sol = new Solution();
        System.out.println(sol.isValid(inp));
    }
}