package leetcode.大学算法训练营.arecursion.done;

import leetcode.大学算法训练营.util.TreeNode;

public class Mindepth111 {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if( root.left == null || root.right == null){
            return left + right + 1;
        }
        return Math.min(left,right) + 1;
    }
}
