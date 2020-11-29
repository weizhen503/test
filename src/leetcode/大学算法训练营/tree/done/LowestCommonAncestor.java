package leetcode.大学算法训练营.tree.done;

import leetcode.大学算法训练营.util.TreeNode;

public class LowestCommonAncestor {
    /**
     * 后续遍历
     * 左右子树从最下面返回值一直返回到根节点，在根节点处获得最后的节点
     * 先左子树进行返回操作，其次进行右子树返回操作。
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null){
            return null;
        }
        /**
         * 这里需要特别注意
         * right == null 或则 left == null必须要放在前面。
         */
        if(right == null && left !=null ){
            return left;
        }
        if(left == null && right != null ){
            return right;
        }
        return root;
    }
}
