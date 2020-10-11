package datastruct;

import java.util.List;

public class DeleteDuplicationTest {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode deleteDuplication(ListNode pnnnHead) {
        //起到被删除的链表的连接作用
        ListNode pre = null;
        //当前节点
        ListNode node = pnnnHead;
        while(node != null) {
            //当前节点的下一个节点
            ListNode nextnode = node.next;
            boolean isdelete = false;
            if(nextnode != null && nextnode.val == node.val){
              isdelete = true ;
            }

            //不删除节点，只需要将pre和node都后移一个位置
            if(!isdelete){
                pre = node;
                node = node.next;
            }else {
                //记录当前节点的值
                int value = node.val;
                //设置删除节点 从当前节点开始
                ListNode dele = node;
                while (dele != null && dele.val == value) {
                    //开始删除节点，当前节点向后移动一个位置
                    node = node.next;
                    //让当前需要删除的节点的后一个节点指向空
                    dele.next = null;
                    dele = node;
                }
                //如果pre为空，表明
                if (pre == null) {
                    pnnnHead = nextnode;
                } else {
                    pre.next = node;
                }
                node = nextnode;
            }
        }
        return pnnnHead;
    }
}
