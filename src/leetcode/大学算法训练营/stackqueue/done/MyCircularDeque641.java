package leetcode.大学算法训练营.stackqueue.done;

class MyCircularDeque641 {

    /** Initialize your data structure here. Set the size of the deque to be k. */
    int element[];
    int front;
    int tail;
    int size;
    public MyCircularDeque641(int k) {
        size = 0;
        front = 0;
        tail = 0;
        element = new int[k + 1];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + element.length ) % (element.length);
        element[front] = value;
        size ++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) return false;
        element [tail] = value;
        tail = (tail + 1) % (element.length);
        size ++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % (element.length );
        size --;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) return false;
        tail = (tail - 1+ element.length ) % (element.length);
        size --;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) return -1;
        return element[front];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) return -1;
        //相当于实现了循环队列，单循环队列里没这个方法，并且这里要获得最后一个元素，
        //单tail指向的是最后一个下标的后一位
        //所以这为了防止数组下标出现负数  就需要tail - 1 + element.length
        return element[(tail - 1+element.length )% (element.length)];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return front == tail;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return front == (tail + 1)% (element.length);
    }
}

