package leetcode.大学算法训练营.tree.done;

import leetcode.大学算法训练营.util.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTree105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //哈希表空间换时间
        Map<Integer,Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i],i);
        }
        TreeNode result = helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inMap);
        return result;
    }

    private TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if(preStart > preEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);
        //inroot 减去 inStart获得的是中序遍历中根节点左边的元素个数
        int leftNum = inRoot - inStart;
        root.left = helper(preorder,preStart + 1,preStart + leftNum, inorder, inStart, inRoot, inMap);
        root.right = helper(preorder, preStart + leftNum + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);
        return root;
    }


}
