package leetcode.大学算法训练营.util;

import java.util.List;

/**
 * @author: wzx
 * @date:2020/11/9 13:02
 * @version:1.0
 */


public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

