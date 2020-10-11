package datastruct;

public class Solution {
   public static void main(String[] args) {
      double a = 4.0;
      double b = 3.0;
      int c = 2;
      int d = 6;
      //问题1：输出是什么？，考察double类型与int类型
      System.out.println(a+2);

      //问题2：考察 c++与++c的区别
      boolean one = a / c == 2.0;
      boolean two =  c++ == c ;
      if( one && two){
         c++;
      }
      System.out.println(++c);

   }


}
