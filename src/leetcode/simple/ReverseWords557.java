package leetcode.simple;

public class ReverseWords557 {

    public static void main(String[] args) {
        ReverseWords557 test = new ReverseWords557();
        String str = "Let's take LeetCode contest";
        System.out.println(test.reverseWords(str));
    }
    public String reverseWords(String s){
        String [] c = s.split("\\s+");
        String result = "";
        int sum = c.length;
        for (int i = 0; i < sum ; i ++){
            char[] b = c[i].toCharArray();
            int num = b.length;
            for( int j = 0 ; j < (num / 2) ; j ++){
                char temp = b[j];
                b[j] = b[num-j-1];
                b[num-j-1] = temp;
            }
            String str = new String(b);
            result += str+" ";
        }
        result = result.trim();
        return result;
    }
}
