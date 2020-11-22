package leetcode.大学算法训练营.line.todo;

public class ClimbStairs70 {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int f1 = 1;
        int f2 = 2;
        int result = 0;
        for(int i = 3 ; i <= n ; i ++){
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }
}
