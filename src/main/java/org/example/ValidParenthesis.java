package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put(')', '(');
        dictionary.put('}', '{');
        dictionary.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {

            Character current = stack.pop();
            Character next = stack.peek();
            Character opposite = dictionary.get(current);

            if (next != opposite) {
                return false;
            }

            stack.pop();
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]"));
    }
}
