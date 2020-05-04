package test;

import com.sun.javaws.IconUtil;

public class Demo {

    public static void main(String[] args) {
        Demo a = new Demo();
        //a.soulution(Integer.MAX_VALUE);
        System.out.println(-123%10);


    }
    int soulution(int x){
        int second = x;
        int num = 1;
        int flag = 1;
        while(flag == 1){
            x = x / 10;
            if(x == 0){
                break;
            }
            num ++;
        }
        int arr[]=new int[num];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = second % 10;
            second = second / 10;
        }
        for(int i = 0 ; i < arr.length; i++){
            if(arr[0] != 0){
                System.out.print(arr[i]);
            }
        }

        return 0;
    }

}



