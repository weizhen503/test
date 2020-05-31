package leetcode.simple;

public class Simple28 {
    public static void main(String[] args) {
        Simple28 text = new Simple28();
        String haystack = "aaaaaaaa";
        String needle = "bba";
        System.out.println(text.strStr(haystack,needle));
    }

    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        boolean temple = haystack.contains(needle);
        if(haystack.contains(needle) != false){
            return  haystack.indexOf(needle);
        }else{
            return -1;
        }
    }
}
