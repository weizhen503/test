package datastruct;

public class CircleLinkedList<T> {

    public class Node<T>{
        public T data;
        public Node next;

        public Node(T e, Node next) {
            data = e;
            this.next = next;
        }

        public Node(T e) {
            data = e;
            next = null;
        }

        public Node() {
            this(null, null);
        }
        public String toString(){
            return data.toString();
        }
    }

    public Node dummyhead;
    public int size;

    CircleLinkedList() {
        dummyhead = new Node(null, null);
        dummyhead.next = dummyhead;
        size = 0;
    }

    public void inser(int index ,T e){
        Node<T> node = new Node<>(e);
        Node temp = dummyhead;
        for(int i = 0 ; i < index && temp.next != dummyhead ; i ++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size ++;
    }
    public String toString() {
        StringBuffer sp = new StringBuffer();
        sp.append("[");
        Node<T> temp = dummyhead;
        temp = dummyhead.next;
        while(temp!=dummyhead) {
            sp.append(temp.data+"->");
            temp = temp.next;
        }
        sp.append("null]");
        return sp.toString();
    }

    public void remove(int index){
        Node temp = dummyhead;
        for(int i = 0 ; i < index && temp.next.next != dummyhead  ; i ++){
            temp = temp.next;
        }
        Node del = temp.next;
        temp.next = del.next;
        del = null;
        size --;
    }

    public static void main(String[] args) {
        CircleLinkedList test = new CircleLinkedList();
        for(int i = 0 ; i < 10 ; i ++){
            test.inser(i,i);
            System.out.println(test);
        }
       test.remove(8);
        System.out.println(test);
}


}
