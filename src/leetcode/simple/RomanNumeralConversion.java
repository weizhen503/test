package leetcode.simple;

import java.util.*;

/**
 *
 */
public class RomanNumeralConversion {
    public static void main(String[] args) {
        RomanNumeralConversion RNC = new RomanNumeralConversion();
        String str = "M";
        int answer = RNC.conversion(str);
        System.out.println(answer);
    }

    int conversion(String s){
        Map<String, Integer> map = new HashMap<String, Integer>();
        String []str = new String[]{"I","V","X","L","C","D","M"};

        int preNum =getValue(s.charAt(0)) ;
        int sum = 0;
        int num = 0;
        for(int i = 1;i < s.length(); i++){
            num = getValue(s.charAt(i));
            if(preNum < num){
                sum -=preNum;
            }else{
                sum += preNum;
            }
            preNum = getValue(s.charAt(i));
        }
        sum += preNum;        return sum;
    }

    int getValue(char ch){
        switch (ch){
            case'I' :return 1;
            case'V' :return 5;
            case'X' :return 10;
            case'L' :return 50;
            case'C' :return 100;
            case'D' :return 500;
            case'M' :return 1000;
        }
        return 0;
    }
}
