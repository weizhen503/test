package leetcode.simple;

import java.util.HashMap;

/**
 * 不是快乐数的数字在多次循环之后肯定会有重复的数字出现
 * 因此可以用哈希表来储存这些数字
 * 先储存1个数字后再用哈希表的containerValue（）方法来判断是否有重复的数字出现
 *
 */
public class HappyNumber202 {
    public static void main(String[] args) {
        HappyNumber202 text = new HappyNumber202();
        System.out.println(text.isHappy(3));
    }

    public boolean isHappy(int n) {
        HashMap map = new HashMap();
        int k = 0;
        int num1 = 0;
        boolean kn = false;
        while(true) {
            int sum = 0;
            while (n != 0) {
                num1 = n % 10;
                n = n / 10;
                sum += num1 * num1;
            }
            n = sum;
            if (k >= 1) {
                boolean an = map.containsValue(sum);
                if (an) {
                    return false;
                }
            }
            map.put(k, sum);
            k++;
            if (sum == 1) {
                return true;
            }
        }
    }

}
