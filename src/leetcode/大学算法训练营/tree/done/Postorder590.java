package leetcode.大学算法训练营.tree.done;

import leetcode.大学算法训练营.util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wzx
 * @date:2020/11/9 13:02
 * @version:1.0
 */
public class Postorder590 {

    public List<Integer> postorder(Node root) {
        return new ArrayList<>();
    }

    public List<Integer> preorder(Node root) {
        ArrayList<Integer> resultList = new ArrayList<>();
        doPreOrder(resultList,root);
        return resultList;

    }

    private void doPreOrder(ArrayList<Integer> resultList, Node root) {
        if(root == null){
            return;
        }
        resultList.add(root.val);
        List<Node> children = root.children;
        for (int i = 0; i < children.size(); i++) {
            doPreOrder(resultList,children.get(i));
        }
    }
}
