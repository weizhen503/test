package leetcode.simple;

/**
 * 1.
 * 2.
 * 3.
 */
public class LongestPrefix14 {
    public static void main(String[] args) {
        //["flower","flow","flight"]

    }
    String solution(String[] str){
        int num = 0;
        int []length=new int[str.length];
        for(int i =0; i <length.length ; i ++){
            length[i] = str[i].length();
        }
        for(int i = 0 ; i < length.length - 1; i++){
            int index = i;
            for(int j = i + 1 ; j < str.length ; j++ ){
                if(length[index] > length[j]){
                    index = j;
                }
            }
            int d = length[i];
            length[i] = length[index];
            length[index]=d;
        }
        for(int i = 0 ; i < str.length ; i++){
           String label = str[0].substring(i);
           for(int j = 0 ; j < str.length ; j++){
               if(label.equals(str[j].substring(i))){
                   num += 1;
           }

           }

        }


        return "";
    }
}
