1. 把大概注释写一下，拷贝的代码不要答案里或者注释一下，不然分不清哪些是自己写的

141题
public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            //这个if语句为什么要两次判断fast
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    
142给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
1先判断该链表是否是循环单链表
1).head为空或者head.next为空直接输出不是循环单链表，即是能否相遇问题，使用快慢指针，如果相遇就是循环单链表
2).如果是循环单链表，第一次相遇过来，将head赋值给fast，且fast的运行速度和slow一样快，当fast和slow再次相遇时，输出fast或slow鸡是。
