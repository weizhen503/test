package leetcode.大学算法训练营.tree.todo;

import leetcode.大学算法训练营.util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wzx
 * @date:2020/11/9 13:01
 * @version:1.0
 */
public class Preorder589 {
    //public static List<Node> list = new ArrayList<>();

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

//    public List<Integer> preorder1(Node root) {
//        List<Integer> list = new ArrayList<>();
//        if(root == null) return list;
//        list.add(root.val);
//        List<Node> cList = root.children;
//        for (int i = 0; i < cList.size(); i++) {
//            Node node = cList.get(i);
//            List<Integer> preorder = preorder(node);
//            list.addAll(preorder);
//        }
//
//        return list;
//    }


}
