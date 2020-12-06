package leetcode.大学算法训练营.tree.done;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis22 {
    ArrayList<String> res = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        huisuo(res,"",0,0,n);
        return res;
    }

    public void huisuo(ArrayList<String> list, String strpath, int leftnum, int rightnum, int n){
        if(leftnum > n || rightnum > n || rightnum > leftnum) return ;
        if(leftnum == rightnum && leftnum == n) {
            list.add(strpath);
            return;
        }
        huisuo(list, strpath+"(", leftnum + 1, rightnum, n);
        huisuo(list, strpath+")", leftnum, rightnum + 1, n);

    }

    public static void main(String[] args) {
        GenerateParenthesis22 demo = new GenerateParenthesis22();
        demo.generateParenthesis(3);
    }

}
