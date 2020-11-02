package leetcode.大学算法训练营.line.done;


import leetcode.大学算法训练营.line.util.ListNode;


public class ReverseKGroup25 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode end = dummy;

        while(end.next != null){
            for (int  i = 0 ; i < k && end != null; i ++){
                end = end.next;
            }
            if(end == null){
                break;
            }
            ListNode next = end.next;
            ListNode start = pre.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }


    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}