package leetcode.simple;

import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args) {
        MissingNumber268 text = new MissingNumber268();
        int arr[]= {9,6,4,2,3,5,7,0,1};
        System.out.println(text.missingNumber(arr));

    }
    //[9,6,4,2,3,5,7,0,1]

    /**
     * 例子 1，2，3，4，6，7，8 这时候缺5
     * 例子1，2，3，4，5，6，7，8这时候缺0
     * 例子1 缺0
     * 例子0 缺1
     * 想法 先用sort排序
     * 然后判断nums[i+1] 是否等于nums[i]+1
     * 上面如果没错且nums[0]!=0的话则返回0
     * 上面如果如果且nums[0]==0的话则返回nums[nums.length]+1；
     *
     */
    public int missingNumber(int[] nums) {
        int result = 0;
        if(nums.length == 1 && nums[0] == 0  ){
            return 1;
        }
        if(nums.length == 1 && nums[0] != 0 ){
            return nums[0] - 1;
        }
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length - 1 ; i ++){
            if(nums[i+1] != nums[i] + 1){
                result = nums[i] + 1;
                return result;
            }
        }
        if(nums[0] != 0){
            return 0 ;
        }
        result = nums[nums.length - 1 ] + 1;
        return result;
    }

}
