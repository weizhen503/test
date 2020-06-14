package leetcode.simple;

import java.util.List;

public class UniteList21 {
    public static void main(String[] args) {
        UniteList21 text = new UniteList21();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        System.out.print(text.mergeTwoLists(l1,l2));

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        //创建两个ListNode类，把参数赋值给这两个对象。
        ListNode first = new ListNode(0);
        ListNode second = first;
        while( l1 != null && l2 != null){
            if(l1.getValue() > l2.getValue() ){
                //这里报错是因为second后面没有新的节点了。
                second.setNext(l2) ;
                l2 = l2.getNext();
            }else {
                second.setNext(l1);
                l1 = l1.getNext();
            }
            second = second.getNext();
        }
        if(l1 == null){
            second.setNext(l2);
        }else{
            second.setNext(l1);
        }

        return first.getNext();
    }


}
