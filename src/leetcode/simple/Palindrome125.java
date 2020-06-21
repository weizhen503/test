package leetcode.simple;

public class Palindrome125 {
    public static void main(String[] args) {
        Palindrome125 text = new Palindrome125();
        System.out.println(text.isPalindrome("race a car"));
    }

    /**
     * 回文串就是整个字符串忽略所有标点符号后正反读都一样的字符串
     * 先用toLowerCase()方法将所有的字母变为小写字母
     * 再用replaceAll()法将所有的标点符号和空格去掉
     * 最后得到一个全部为小写字母且无空格的字符串
     * 再利用双指针解题
     */
    public boolean isPalindrome(String s) {
        boolean ans = true;
        String ss = s.toLowerCase();
        ss =  ss.replaceAll( "[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]" , "");
        ss =  ss.replaceAll(" ","");
        for(int i = 0 ; i < ss.length() / 2 ; i ++){
          if(ss.charAt(i) != ss.charAt(ss.length()- 1 - i)){
              ans = false;
              break ;
          }
        }
        return ans;
    }
}
