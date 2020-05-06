package leetcode.simple;

public class IntegerConvert7 {
    public static void main(String[] args) {
        IntegerConvert7 a = new IntegerConvert7();
        int answer = a.soulution(-123);
        System.out.println(answer);
    }
    /**
     1.x的范围在【-2^31,2^31-1】
     2.溢出返回0
     3.解法：确定参数x的数字个数，创建对应大小的数组，利用取余将值传入数组，再判断正负数添加相应计算符。
        输出：找出最前非零数记录其下标，index前面的不输出。
     4.0 最大 最小  1000 -1000  -123
     */
     int soulution(int x) {
         int second = x;
         int flag=x;
         int num = 1;
         //while循环，取余找个数。得到个数num
         //int number = 0;
         while (true) {
             x = x / 10;
             if (x == 0) {
                 break;
             }
             num++;
         }
         //创建大小为number的整型数组
//         int arr[] = new int[num];
//         int index = 0;
         String str = "";
         //for循环取余将数存进数组

         for (int i = 0; i < num; i++) {
             int a = (second < 0 ? -1: 1)*(second % 10);
             second = second / 10;

//             if (index == 0 && arr[i] != 0){
//                 index = i;
//             }

             if(!(str.equals("") && a == 0)){
                 str += a;
             }
         }
         //找到数组中最先不为0的下标，再将剩余的转化为整型
//         int index = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 index = i;
//                 break ;
//             }
//         }

//         String str = "";
//         for (int i = index; i < arr.length; i++) {
//             str += arr[i];
//         }
         int answer=0;
         try{
          answer = Integer.valueOf(str);
         }catch(Exception e){
             return 0;
         }

        if(flag < 0 ){
            answer = -answer;
        }
         return answer;
     }

}


/**
 * int solution(int x){
 *         int answer = 0;
 *         while(x != 0 ){
 *             int y = x % 10;
 *             x = x / 10;
 *
 *             if(answer > Integer.MAX_VALUE / 10){
 *                 return 0;
 *             }
 *             if(answer < Integer.MIN_VALUE / 10){
 *                 return 0;
 *             }
 *             answer = answer * 10 + y;
 *         }
 *         return answer;
 *     }
 */
