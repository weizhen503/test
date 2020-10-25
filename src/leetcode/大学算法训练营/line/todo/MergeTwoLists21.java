package leetcode.大学算法训练营.line.todo;

import leetcode.大学算法训练营.util.ListNode;

/**
 * @author: wzx
 * @date:2020/10/19 7:48
 * @version:1.0
 */
public class MergeTwoLists21 {
    public class ListNode {

        private int value;
        private ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode result_temp = result;
        while(l1 != null || l2 != null ){
            if(l1 != null && l2 == null){
                result_temp.next = l1;
                l1 = l1.next;
                result_temp = result_temp.next;
                continue;
            }else if(l1 == null && l2 !=null){
                result_temp.next = l2;
                l2 = l2.next;
                result_temp = result_temp.next;
                continue;
            }else if(l1.value < l2.value){
                result_temp.next = l1;
                l1 = l1.next;
                result_temp = result_temp.next;
                continue;
            }else {
                result_temp.next = l2;
                l2 = l2.next;
                result_temp = result_temp.next;
                continue;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {

    }
}
