package leetcode.大学算法训练营.line.done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public void rotate(int[] nums, int k){
        reverse(nums,0,nums.length - 1);
        reverse(nums,0,k - 1);
        reverse(nums,k,nums.length - 1);
    }

    public void reverse(int []nums,int start,int end){

        while(start < end){
            int temp = nums[start];
            start = end;
            end = temp;
            start ++;
            end --;
        }
    }
}
