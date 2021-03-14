package com.liuning.algorithms.leetcode;

import java.util.*;

/**
 * 20.有效的括号
 *
 * @author liuning
 * @since 2021-03-13 22:21
 */
public class No20ValidParentheses {

    public static void main(String[] args) {

        String str = "[]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {

        LinkedList<Character> list = new LinkedList<>();
        list.push('A');
        char[] strs = s.toCharArray();

        for (char str : strs) {
            if (str == ')') {
                if (list.peek().equals('(')) list.pop();
                else list.push(str);
            } else if (str == '}') {
                if (list.peek().equals('{')) {
                    list.pop();
                } else {
                    list.push(str);
                }
            } else if (str == ']') {
                if (list.peek().equals('[')) {
                    list.pop();
                } else {
                    list.push(str);
                }
            } else {
                list.push(str);
            }
        }

        return list.size() == 1;
    }

    public boolean isValid1(String s) {
        if (s.isEmpty())
            return true;
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.empty() || c != stack.pop())
                return false;
        }
        return stack.empty();
    }

    private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('{', '}');
        put('[', ']');
        put('(', ')');
        put('?', '?');
    }};

    public boolean isValid2(String s) {
        if (s.length() > 0 && !map.containsKey(s.charAt(0))) return false;
        LinkedList<Character> stack = new LinkedList<Character>() {{
            add('?');
        }};
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) stack.addLast(c);
            else if (map.get(stack.removeLast()) != c) return false;
        }
        return stack.size() == 1;
    }

}
