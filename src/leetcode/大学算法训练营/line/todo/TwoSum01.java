package leetcode.大学算法训练营.line.todo;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 资料：twosum核心思想 https://labuladong.gitbook.io/algo/suan-fa-si-wei-xi-lie/twosum-wen-ti-de-he-xin-si-xiang
 *      双指针技巧 https://labuladong.gitbook.io/algo/suan-fa-si-wei-xi-lie/shuang-zhi-zhen-ji-qiao
 * @date:2020/10/13 7:37
 * @version:1.0
 */
public class TwoSum01 {

    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i ++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

}
