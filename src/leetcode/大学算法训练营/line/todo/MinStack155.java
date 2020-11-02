package leetcode.大学算法训练营.line.todo;

import java.util.Stack;

//辅助栈解题   太慢了
public class MinStack155 {

    Stack<Integer> stack = new Stack();
    Stack<Integer> temp = new Stack();
    public MinStack155() {
    }

    public void push(int x) {
        stack.push(x);
        if(temp.isEmpty() || temp.peek() >= x){
            temp.push(x);
        }
    }

    public void pop() {
        int value = stack.pop();
        if(value == temp.peek()){
            temp.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return temp.peek();
    }
}
