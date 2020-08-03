package leetcode.simple;

public class NimGame292 {

    public static void main(String[] args) {

    }

    /**
     * 有规律
     * 当石头数字是4的整数倍时(对手)获胜不包括0
     *
     *
     * 1 true
     * 2 true
     * 3 true
     * 4 false
     * 5 true
     * 6 true
     * 7 true
     * 8 false
     * 9 true 1 2
     * 10 true
     * 11 true
     * 12 false 16 20 24 28 32
     */
    public boolean canWinNim(int n) {
        boolean result = true;
        if (n < 4) {
            return result;
        }
        if (n % 4 == 0) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
