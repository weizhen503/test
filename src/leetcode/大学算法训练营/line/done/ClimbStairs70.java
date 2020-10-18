package leetcode.大学算法训练营.line.done;

public class ClimbStairs70 {
    public int climbStairs(int n) {
        int first = 1;
        int second = 2;
        if (n<=2){
            return n;
        }
        int sum = 0;
        for(int i = 3 ; i <= n ; i ++){
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
