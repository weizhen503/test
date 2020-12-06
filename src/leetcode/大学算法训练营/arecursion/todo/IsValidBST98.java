package leetcode.大学算法训练营.arecursion.todo;

import leetcode.大学算法训练营.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wzx
 * @date:2020/11/24 19:40
 * @version:1.0
 */
public class IsValidBST98 {
    /**
     * 上面有资料 materials里面 二叉搜索树操作集锦.md
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        List<Integer> list = new ArrayList<Integer>();
        getsortList(root,list);
        return isresult(list);
    }

    public void getsortList(TreeNode root, List<Integer> list){
        if(root != null){
            getsortList(root.left,list);
            list.add(root.val);
            getsortList(root.right,list);
        }
    }

    public boolean isresult(List<Integer> list){
        for(int i = 0; i < list.size() - 1; i ++){
            if(!(list.get(i) < list.get(i + 1))){
                return false;
            }
        }
        return true;
    }

}
