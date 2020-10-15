package leetcode.大学算法训练营.line.todo;

public class ReverseList206 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
      //双指针法   需要注意的是 最后返回值是pre
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode pre = null;
        ListNode next = null;
        while(node!=null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
