package datastruct;

public class DeleteDuplication {
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public ListNode deleteDuplication(ListNode pnnnHead) {
        ListNode prenode = null;
        ListNode node = pnnnHead;
        while (node != null) {
            ListNode nextnode = node.next;
            boolean isDelete = false;
            if (nextnode != null && node.val == nextnode.val)
                isDelete = true;

            if (!isDelete) {
                prenode = node;
                node = node.next;
            } else {
                int value = node.val;
                ListNode  dele = node;
                while (dele != null && dele.val == value) {
                    nextnode = dele.next;
                    dele.next = null;
                    dele = nextnode;
                }
                if (prenode == null) {
                    pnnnHead = nextnode;
                } else {
                    prenode.next = nextnode;
                }
                node = nextnode;
            }
        }
        return pnnnHead;
    }

}