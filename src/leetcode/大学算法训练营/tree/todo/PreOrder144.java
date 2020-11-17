package leetcode.大学算法训练营.tree.todo;

import leetcode.大学算法训练营.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrder144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        doPreOrder(list, root);
        return list;
    }

    private void doPreOrder(List<Integer> list, TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root.left);
        treeNodes.add(root.right);

        for (int i = 0; i < treeNodes.size(); i++) {
            TreeNode treeNode = treeNodes.get(i);
            doPreOrder(list, treeNode);
        }

//        doPreOrder(list, root.left);

//        doPreOrder(list, root.right);

    }
}
