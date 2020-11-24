package leetcode.大学算法训练营.arecursion.done;

import leetcode.大学算法训练营.util.TreeNode;

public class Inverttree226 {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode tempNode = root.right;
        root.right = root.left;
        root.left = tempNode;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
