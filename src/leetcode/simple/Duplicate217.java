package leetcode.simple;

import java.util.Arrays;

public class Duplicate217 {
    public static void main(String[] args) {
        Duplicate217 text = new Duplicate217();
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(text.containsDuplicate(arr));

    }

    /**
     * [1,1,1,3,3,4,3,2,4,2]
     * 对数组进行排序。
     * 然后让后一个与前一个对比
     * 如果存在相等的两个数返回true
     * 否则返回false
     */
    public boolean containsDuplicate(int[] nums) {
//        if(nums.length <= 1){
//            return false;
//        }
//
//        for(int i = 0 ; i < nums.length - 1; i ++){
//            int k=i;
//            for(int j = i + 1 ; j < nums.length ; j ++){
//                if(nums[j] < nums[k]){
//                    k = j ;
//                }
//            }
//            int temp = nums[k];
//            nums[k] = nums[i];
//            nums[i] = temp;
//        }
//        boolean result = false;
//        for(int i = 1 ; i < nums.length ; i ++){
//            if(nums[i] == nums[i-1]){
//                result = true;
//            }
//        }
        /** boolean result = false;
         if(nums.length <= 1){
         return result;
         }
         for(int i = 0 ; i < nums.length - 1 ; i ++){
         for(int j = i + 1 ; j < nums.length ; j ++){
         if(nums[i] == nums[j]){
         result = true;
         }
         }
         }
         return result;
         }
         }*/
//        if(nums.length <= 1){
//            return false;
//        }
//        HashMap map = new HashMap();
//        map.put(0,nums[0]);
//        for(int i = 1 ; i < nums.length ; i ++){
//            if(map.containsValue(nums[i])){
//                return true;
//            }
//            map.put(i,nums[i]);
//        }
//        return false;
        int n=nums.length;
        Arrays.sort(nums);//排序复杂度O(nlogn)
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}