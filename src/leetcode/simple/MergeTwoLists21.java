package leetcode.simple;


import java.util.Arrays;

public class MergeTwoLists21 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.setNext(node2);
        node2.setNext(node3);

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.setNext(node5);
        node5.setNext(node6);

        MergeTwoLists21 mergeTwoLists21 = new MergeTwoLists21();

        System.out.println(mergeTwoLists21.mergeTwoLists(node1,node4).getValue());
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        return null;
    }
}
