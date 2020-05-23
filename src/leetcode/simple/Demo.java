package leetcode.simple;

public class Demo {
    public static void main(String[] args) {
/*        String []str={"abc","ab","abd"};
        Demo demo = new Demo();
        String answer=demo.solution(str);
        System.out.println(answer);*/
        System.out.println("bcdhab".indexOf("ab"));

    }

    String solution(String[] str){

        int ans = 0;
        if(str.length == 0){
            return "";
        }

        for(int i = 0 ; i < str[0].length() ; i++){
            int num = 1;
            char label = str[0].charAt(i);
            for(int j = 1 ; j < str.length ; j++){
                if (str[j].length() == i){
                    break;
                }
                if(label == str[j].charAt(i)){
                    num += 1;
                }
            }
            if(num == str.length){
                ans += 1;
            }else{
                break;
            }

        }

        return ans == 0 ? "" :str[0].substring(0,ans == 1 ? 1 : ans);
    }
}
