package leetcode.simple;

import java.util.Stack;

public class Simple20 {

    public static void main(String[] args) {
        Simple20 s20 = new Simple20();
        String text = "()}[";
        System.out.println(text);
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char []chArr = s.toCharArray();
        int num = chArr.length;
        if(num % 2 != 0){
            return false;
        }
        for(int i = 0; i < num ; i++){
            if(chArr[i] == '{') {
                stack.push('}');
            }else if(chArr[i] == '['){
                stack.push(']');
            }else if(chArr[i] == '('){
                stack.push(')');
            }else if(num <= 1 || chArr[0] == ')'|| chArr[0] ==']'|| chArr[0] =='}' ||chArr[i] != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
