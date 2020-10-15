package leetcode.大学算法训练营.line.todo;


//判断一个链表存不存在环
public class HasCycle141 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
      //快慢指针法。。。龟兔赛跑的思路，如果在一个圆上赛跑，兔子肯定能再次追上龟子
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(true){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        return true;
    }
}
