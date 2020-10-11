package Sword2offer;



public class Solution {

    public static void main(String[] args) {
        int pre[] = {1,2,4,7,3,5,6,8};
        int in[] = {4,7,2,1,5,3,8,6};
        System.out.println(new Solution().reConstructBinaryTree(pre,in));
    }

    //前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        //数组长度
        int len = pre.length;

        //找到根节点
        TreeNode root = new TreeNode(pre[0]);

        //递归结束条件：说明只剩下一个了，表示叶子节点,递归可以退出了
        if (pre.length == 1) {
            root.left = null;
            root.right = null;
            return root;
        }

        // 根节点在中序遍历中的下标               //错 中间值 在{4,7,2,1,5,3,8,6} 这个中间值第一次应该是3
        int rootIndex = 0;
        for (int i = 0; i < len; i++) {
            //在中序中找到根节点
            if (pre[0] == in[i]) {
                rootIndex = i;
                break;
            }
        }

        if (rootIndex > 0) {
            //左子树的先序
            int[] leftPre = new int[rootIndex];
            //左子树的中序
            int[] leftIn = new int[rootIndex];
            for (int j = 0; j < rootIndex; j++) {
                leftPre[j] = pre[j + 1];
            }
            for (int j = 0; j < rootIndex; j++) {
                leftIn[j] = in[j];
            }
            //左子树递归                         一 247       472
            root.left = reConstructBinaryTree(leftPre, leftIn);
        } else {
            root.left = null;
        }


//in.length - rootIndex - 1  右子树长度
        if (in.length - rootIndex - 1 > 0) {
            //右子树的先序,长度为 总-根-左子树
            int[] rightPre = new int[pre.length - 1 - rootIndex];
            //右子树的中序
            int[] rightIn = new int[pre.length - 1 - rootIndex];

            for (int j = rootIndex + 1; j < len; j++) {
                //右子树中序，为什么要j-rootIndex-1呢 因为我的rightIn要从0开始 而j是k+1开始的 ，所以很尴尬，只能用j-rootIndex-1
                rightIn[j - rootIndex - 1] = in[j];

                rightPre[j - rootIndex - 1] = pre[j];
            }
                                                //7        7
            root.right = reConstructBinaryTree(rightPre, rightIn);
        } else {
            root.right = null;
        }

        return root;

    }

}