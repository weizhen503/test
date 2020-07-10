package leetcode.simple;

public class TrailingZeroes172 {
    public static void main(String[] args) {
        TrailingZeroes172 text = new TrailingZeroes172();
        System.out.println(text.trailingZeroes(30));
    }

    public int trailingZeroes(int n) {
        //第一种办法需要考虑MAX值溢出问题，所以不能用
//        int nums = 1;
//        int temp = 0;
//        for (int i = 1; i <= n; i++) {
//            nums *= i;
//            if(nums % 10 == 0 ) {
//                temp++;
//                nums = nums / 10;
//            }
//
//        }

        /**
         * 结尾出现0是2*5的缘故    所以只要找出2/5的对数 但2远多于5   即找出5的
         * 例如  10的阶乘可以写成  1*2*3*4*5*6*7*8*9*2*5 有2个5出现
         * 例如   15的阶乘 1，2，3，4，5，6，7，8，9，2*5，11，12，13，14，3*5
         * 30的阶乘 1，2，3，4，5，6，7，8，9,2*5,11,12,13,14,3*5,16,17
         * 18,19,4*5,21,22,23,24,5*5,26,27,28,29,5*6;
         *
         * //////////////这个代码超时了。继续优化
         */
      /**  int nums = 0;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            k = i;
            while (k > 0) {
                if (k % 5 == 0) {
                    nums++;
                    k = k / 5;
                } else {
                    break;
                }

            }
        }
        return nums;
       */

        /**
         * 1-5 1
         * 6-14 2
         * 15-19 3
         * 20-24 4
         * 25-29 6
         * ********注意    5*5   这里有2个
         */
        int nums = 0 ;
        while (n > 0){
            nums += n / 5 ;
            n = n / 5;
        }
        return nums;
    }
}



