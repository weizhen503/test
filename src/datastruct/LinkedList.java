package datastruct;

public class LinkedList<T> {
    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test.joseph(5,0,3);
    }
    public void joseph(int number , int start ,int distance){
        int i = start;
        LinkedList<Character> linlist = new LinkedList();
        char cal ='A';
        for(int j = 0 ; j < number ; j ++){
            linlist.addLast(cal);
            cal = (char) (cal + 1);
        }
        
        System.out.println(linlist);
        while(linlist.getSize() > 1){
            i = (i +distance-1)%linlist.getSize();
            linlist.remove(i);
            System.out.println(linlist);
        }
        System.out.println("被赦免的人是："+linlist.get(0));

    }

    public class Node{
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

    LinkedList() {
        dummyhead = new Node(null, null);
        size = 0;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index < 0 || index > size");
        }
        Node prev = dummyhead;
        for (int i = 0; i <= index; i++) {
            prev = prev.next;
        }
        return (T) prev.data;
    }

    public int getSize() {
        return size;
    }

    public void add(int index, T e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index < 0 || index > size ");
        }
            Node prev = dummyhead;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;
            size++;
    }

    public void addFirst(T e) {
        add(0, e);
    }

    public void addLast(T e) {
        add(size, e);
    }

    public void remove(int index) {
        Node prev = dummyhead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node del = prev.next;
        prev.next = del.next;
        del.next = null;
        size--;
    }

    public void removeFirst() {
        remove(0);
    }

    public void removeLast() {
        remove(size - 1);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        Node cur = dummyhead.next;
        while (cur!=null){
            str.append(cur.data + "->");
            cur = cur.next;
        }
        str.append("null]");
        return str.toString();
    }
}
