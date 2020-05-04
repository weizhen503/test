package leetcode.simple;

import java.util.Arrays;
import java.util.HashMap;

//todo Hasmap新知识点与新的解法
public class TwoNumIndex1 {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length <=1){
            return new int[2];
        }
        int [] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int result = target - current;
            Integer index = map.get(result);
            if(null == index){
                map.put(current,i);
            } else{
                arr[0] = i;
                arr[1] = index;
                break;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        TwoNumIndex1 a = new TwoNumIndex1();
        int []nums={2,5,8,10};
        int target = 10;
        int[] twoSum = a.twoSum(nums, target);
        System.out.println(twoSum);
        System.out.println(Arrays.toString(twoSum));
    }

}
