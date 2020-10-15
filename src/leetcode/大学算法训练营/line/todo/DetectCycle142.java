package leetcode.大学算法训练营.line.todo;

public class DetectCycle142 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //双指针法求刚进入循环链表时的节点
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast = head;
        while(true){
            if(fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)  break;
        }
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
