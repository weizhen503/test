package leetcode.simple;

import java.util.Arrays;

public class Anagram242 {
    public static void main(String[] args) {
        Anagram242 text = new Anagram242();
        //s = "anagram", t = "nagaram"
        String s = "anagram";
        String t = "nagaram";
        System.out.println(text.isAnagram(s,t));
    }
    public boolean isAnagram(String s, String t) {
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();
        int sNum = sArr.length;
        int tNum = tArr.length;
        if(sNum != tNum){
            return false;
        }
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for(int i = 0 ; i < sNum ; i ++ ){
            if(sArr[i] != tArr[i]){
                return false;
            }
        }
        return true;
    }
}
