package leetcode.大学算法训练营.arecursion.done;

import leetcode.大学算法训练营.util.TreeNode;

public class Maxdepth104 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Integer.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
