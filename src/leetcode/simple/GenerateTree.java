package leetcode.simple;


import java.util.Stack;

/**
 * @author: wzx
 * @date:2020/12/5 17:05
 * @version:1.0
 */
public class GenerateTree {

    Stack<TreeNode> stack = new Stack<>();
    int count = 0;

    public TreeNode getTree(String[] prefix) {
        String value = prefix[count++];
        if (value == null) return null;
        TreeNode root = new TreeNode(value);
        stack.add(root);
        setLeftChildren(root, prefix);

        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            String rightValue = prefix[count++];
            if (rightValue == null) continue;
            TreeNode rightNode = new TreeNode(rightValue);
            stack.add(rightNode);
            pop.right = rightNode;
            setLeftChildren(rightNode, prefix);
        }
        return root;
    }

    private void setLeftChildren(TreeNode root, String[] prefix) {
        if (count >= prefix.length) return;
        String value = prefix[count++];
        if (value == null) return;
        TreeNode left = new TreeNode(value);
        root.left = left;
        stack.add(left);
        setLeftChildren(left, prefix);
    }

    public static void main(String[] args) {
        String[] prefix = new String[]{"A", "B", null, "D", null, null, "C", null, null};
        GenerateTree generateTree = new GenerateTree();
        generateTree.getTree(prefix);
    }


    class TreeNode {
        public String val;
        public TreeNode left;
        public TreeNode right;

        TreeNode() {
        }

        public TreeNode(String val) {
            this.val = val;
        }

        TreeNode(String val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
