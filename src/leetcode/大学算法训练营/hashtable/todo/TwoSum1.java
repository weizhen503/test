package leetcode.大学算法训练营.hashtable.todo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wzx
 * @date:2020/11/9 12:57
 * @version:1.0
 */

/**
 * method:HashMap
 * 将数组的下标做为键值，数组的元素作为键对->put
 * 用map.containsKey(target-nums[i])来判断是否存在答案，如果存在 答案一个为下标i 一个为map.get(target-nums[i]);
 *
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i  = 0 ; i < nums.length ;i ++){
            int result = target - nums[i];
            if(map.containsKey(result)){
                res[0] = map.get(result);
                res[1] = i;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
