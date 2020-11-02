package leetcode.大学算法训练营.line.done;

/**
 * @author: wzx
 * @date:2020/10/19 7:48
 * @version:1.0
 */
public class PlusOne66 {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length - 1 ; i >= 0  ; i --){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


}
