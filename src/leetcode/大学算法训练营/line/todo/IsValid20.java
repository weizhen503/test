package leetcode.大学算法训练营.line.todo;

import java.util.Stack;

public class IsValid20 {

    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }else
            if ((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && stack.isEmpty()) {
                return false;
            }else
            if ((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == ']' && stack.peek() == '[') || (s.charAt(i) == '}' && stack.peek() == '{')) {
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IsValid20 test = new IsValid20();
        System.out.println(test.isValid("{[]}"));
    }
}
