package leetcode.simple;

public class Steal198 {
    public static void main(String[] args) {
        Steal198 text = new Steal198();
        int arr[]={2,7,9,3,1};
        System.out.println(text.rob(arr));

    }

    /**
     * 第一种想法：
     * 数组下标偶数之和包括0
     * 数组下标奇数之和
     * 再比较大小
     * 错误：可以跳过两个房子再偷【2，1，1.2】
     *  int evenSum = 0, oddSum = 0;
     *         for(int i = 0 ; i < nums.length ; i ++){
     *             if( i % 2 == 0 ){
     *                 evenSum += nums[i];
     *             }else{
     *                 oddSum += nums[i];
     *             }
     *         }
     *         int max = 0;
     *         if(evenSum >= oddSum ){
     *             max = evenSum;
     *         }else{
     *             max = oddSum;
     *         }
     *         return max;
     *
     *
     * 第二种想法：
     * 描述的是当小偷偷到“第n个房间时的钱最大数目”   *小偷所到达的每个房间都是目前偷取到的最大数目*
     ********** 可知道dp[i]>=dp[i-1]
     * dp[i-1] 表示不偷当前第i个房间
     * dp【i-2】+nums【i】表示偷取当前第i个房间的财物
     * dp[i]= Math.max(dp[i-1],dp[i-2]+nums[i]
     *
     *
     */
    public int rob(int[] nums) {
       int num = nums.length;
       if(num == 0 ){
           return 0;
       }
       if(num == 1 ){
           return nums[0];
       }
       int dp[]=new int[num];
       dp[0] = nums[0];
       dp[1] = Math.max(dp[0],nums[1]);
       for(int i = 2 ; i < num ; i ++ ){
           dp[i] = Math.max(dp[ i - 1 ] , dp[ i - 2] + nums[i]);
       }

       return dp[ num - 1 ];
    }
}
