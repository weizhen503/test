package leetcode.simple;

public class ReverseString344 {
    public static void main(String[] args) {

    }
    //[0,1,2,3,4]
    public void reverseString(char[] s) {
        int sum = s.length; //5
        int num = sum / 2;  // 2
        for(int i = 0 ; i < num ; i ++){
            char temp = s[i];
            s[i] = s[sum-i-1];
            s[sum-i-1] = temp;
        }
    }
}
