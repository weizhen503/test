package leetcode.大学算法训练营.line.todo;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow239 {
    /**
     *利用双端队列来完成(双端队列用来存取数组的下标值）
     * @param nums
     * @param k
     * @return
     * 做法： 从左往右遍历一遍
     * 结果数组的长度为 nums.length - k + 1
     *
     * 双端队列中的元素是升序排列的    当有新元素要插入双端队列尾端时必须要与队列中现有的尾元素进行比较    如果准备插入的元素大小小于队列尾元素大小 则直接插入尾部
     * 当新元素的大小比尾部元素大时 则将队列中的尾部元素除去      其余的元素也都如此比较
     *
     *窗口是有大小限制的 当窗口向右移动时 双端队列里可能还存在上一个窗口中的元素  这时候需要去掉 去除下标即可  满足条件：deque.getFirst() <= i - k;
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int result[] = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0 ; i < nums.length ; i ++){
            while(!deque.isEmpty() && nums[deque.getLast()] < nums[i]){
                deque.pollLast();
            }
            deque.addLast(i);

            while(!deque.isEmpty() && deque.getFirst() < i - k){
                deque.pollFirst();
            }

            if(i >= k -1){
                result[i - k + 1] = nums[deque.getFirst()];
            }
        }
        return result;
    }
}
