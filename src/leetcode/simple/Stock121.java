package leetcode.simple;

public class Stock121 {
    /**
     * 求售卖股票的最大利润问题
     * 关键是要求解出所有的前一个数减后一个数的差值，差值若都为负数，则返回0
     * 差值不为负数，则返回最大数
     * 双for循环就能解决
     *
     */

    static void main(String[] args) {
        Stock121 text = new Stock121();
        int []prices = {7,1,5,3,6,4};
        System.out.println(text.maxProfit(prices));
    }
    //[7,1,5,3,6,4]
    public int maxProfit(int[] prices) {
        int max = 0;
        int temp = 0;
        for(int i = 0 ; i < prices.length ; i ++){
            for( int j = i+1 ; j < prices.length ; j ++){
                 temp = prices[j] - prices[i];
                 if(temp > max){
                     max = temp;
                 }
            }
        }

        return max;
    }
}
