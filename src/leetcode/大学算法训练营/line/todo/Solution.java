package leetcode.大学算法训练营.line.todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode next = null;
        ListNode pre = null;
        while(node != null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }


}
