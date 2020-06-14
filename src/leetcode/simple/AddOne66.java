package leetcode.simple;

public class AddOne66 {
    public static void main(String[] args) {
        AddOne66 text  =  new AddOne66();
        int [] arr = {9};
        System.out.println(text.plusOne(arr));
    }

    public int[] plusOne(int[] digits) {
        //以下是不能克服int越界的算法
//        if (digits[0] != 0) {
//            int sum = digits[0];
//            int temple = 9;
//            int ant = 1;
//            //将数组转化为整数,temple记录是否需要多加1位，ant
//            for (int i = 1; i < digits.length; i++) {
//                sum = sum * 10 + digits[i];
//                temple = temple * 10 + 9;
//                ant = ant * 10;
//            }
//            temple = temple + 1;
//            sum = sum + 1;
//
//            if (temple == sum) {
//
//                String str = String.valueOf(sum);//num为需要转化的整数
//                digits = new int[str.length()];
//                for(int i=0;i<str.length();i++){
//                    digits[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
//                    System.out.println(digits[i]);
//                }
//            } else {
//                String str = String.valueOf(sum);//num为需要转化的整数
//                digits = new int[str.length()];
//                for(int i=0;i<str.length();i++){
//                    digits[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
//                    System.out.println(digits[i]);
//                }
//
//            }
//        }else{
//            digits[0] = 1;
//        }
//        return digits ;}

        for(int i = digits.length - 1 ; i >= 0 ; i -- ){
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }
            //大于9就将该为设置为0
            digits[i] = 0;
        }
        int answer[] = new int[digits.length + 1];
        answer[0] = 1 ;
        return answer;
        }
    }
