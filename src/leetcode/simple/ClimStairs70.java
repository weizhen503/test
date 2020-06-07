package leetcode.simple;

public class ClimStairs70 {
    public static void main(String[] args) {
        ClimStairs70 a = new ClimStairs70();
        System.out.println(a.climbStairs(2));
    }
    public int climbStairs(int n) {
        if(n == 1 ){
            return 1;
        }
        if(n == 2 ){
            return 2;
        }
        if(n == 3 ){
            return 3;
        }
        int sum[] = new int[n-1];
        sum[0] = 2;
        sum[1] = 3;

        for(int i = 2 ; i < n-1 ; i ++ ){
            sum[i] = sum [ i - 1 ] + sum[ i - 2 ];

        }
        return sum[n-2];
    }
}
