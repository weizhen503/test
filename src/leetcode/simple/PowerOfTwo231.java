package leetcode.simple;

public class PowerOfTwo231 {

    public static void main(String[] args) {
        PowerOfTwo231 test = new PowerOfTwo231();
        System.out.println(test.isPowerOfTwo(218));

    }

    /**
     *if n % 2 != 0 则必为奇数  return false
     *if n ！= 1 or 2 则让 n = n / 2;缩小一半
     * 然后while 2的多少次幂result等于n  if result > (n/2) 则return false
     */

    public boolean isPowerOfTwo(int n) {
        boolean label = true;
        int result = 1;
        if(n == result || n == 2){
            return label;
        }
        if(n % 2 != 0 ){
            return false;
        }
        n = n / 2 ;
        while(label){
            result = result * 2;
            if(result == n){
                return label;
            }
            if(result > n){
                return false;
            }
        }
        return true;
    }
}
