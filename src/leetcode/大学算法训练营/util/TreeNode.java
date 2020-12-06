package leetcode.大学算法训练营.util;

/**
 * @author: wzx
 * @date:2020/11/9 13:04
 * @version:1.0
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public  TreeNode right;
    TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
