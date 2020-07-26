package leetcode.simple;

public class Prime204 {
    public static void main(String[] args) {
        Prime204 text = new Prime204();
        System.out.println(text.countPrimes(5));

    }

    public int countPrimes(int n) {
/**
 * 这个算法太慢了不通过
 */
//        int num = 0;
//        for(int j = 2 ; j < n ; j ++) {
//            int sum = 0;
//            if(j % 2 ==0 && j != 2){
//                continue;
//            }
//            for (int i = 2; i < j/2; i++) {
//                if (j % i == 0) {
//                    sum = 1;
//                    break;
//                }
//            }
//            if (sum != 1) {
//                num += 1;
//            }
//        }
//        return num;
        /**
         * 创建长度为n的数组 将0到（n-1）存入这个数组
         *
         * 质数一定不是某个数的倍数
         * 比如4 2*2 ； 8 2*2*2 ; 9 3*3
         * 因此排除掉这些
         * 剩下的就是质数
         */
        int sum[] = new int[n];
        int result = 0 ;
        for(int i = 2 ; i < n ; i ++){
            sum[i] = i;
        }
        /**
         * n<4时不进入这个循环
         * n=4时进入这个循环但不起作用
         * 当n=5时这个双循环才起作用
         */
        for(int i = 2 ; i <= n/2 ; i ++){
            for(int j = 2*i ; j < n ; j +=i ){
                sum[j] = 0;
            }
        }

        for( int i = 2 ; i < n ; i ++){
            if(sum[i] != 0){
                result ++;
            }
        }
        return result;
    }
}