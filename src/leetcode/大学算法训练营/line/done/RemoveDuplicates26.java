package leetcode.大学算法训练营.line.done;

import leetcode.大学算法训练营.line.util.ListNode;

/**
 * @author: wzx
 * @date:2020/10/19 7:48
 * @version:1.0
 */
public class RemoveDuplicates26 {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int j = 1 ; j < nums.length ; j ++){
            if(nums[index] != nums[j]){
                nums[index + 1] = nums[j];
                index ++;
            }
        }
        return ++ index;
    }

    public static void main(String[] args) {

    }
}
