package Sword2offer;

public class solution4 {
    public static void main(String[] args) {
        int pre[] = {1,2,4,7,3,5,6,8};
        int in[] = {4,7,2,1,5,3,8,6};
        System.out.println(new Solution().reConstructBinaryTree(pre,in));
    }
    public TreeNode reConstructBinaryTree(int pre[] , int in[]){

        TreeNode root = new TreeNode(pre[0]);

        int length = pre.length;
        if(pre.length == 1){
            root.left = null;
            root.right = null;
            return root;
        }

        int index = 0;
        for(int i = 0 ; i < length ; i ++){
            if(pre[0] == in[i]){
                index = i;
                break;
            }
        }

        if(index > 0){
            int leftpre [] = new int[index];
            int leftin[] = new int[index];
            for(int i = 0 ; i < index ; i ++){
                leftpre[i] = pre[i+1];
                leftin[i] = in[i];
            }
            root.left = reConstructBinaryTree(leftpre,leftin);
        }else{
            root.left = null;
        }

        if(length - 1 - index > 0){
            int rightpre[] = new int[length - 1 - index];
            int rightin[] =  new int[length - 1 - index];
            for(int i = 0 ; i < length - index - 1 ; i ++){
                rightpre[i] = pre[index + 1+i];
                rightin[i] = in[index+1+i];
            }
            root.right = reConstructBinaryTree(rightpre,rightin);
        }else{
            root.right = null;
        }

        return root;
    }
}
