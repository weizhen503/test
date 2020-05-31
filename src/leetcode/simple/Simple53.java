package leetcode.simple;

public class Simple53 {
    public static void main(String[] args) {
        //[-2,1,-3,4,-1,2,1,-5,4]
        Simple53 text = new Simple53();
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(text.maxSubArray(arr));

    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int max = nums[0];
        int sum = nums[0];
        for(int i = 0 ; i < nums.length ; i ++){
            if(i >= 1){
                sum = nums[i-1];
            }
            for(int j = i ; j < nums.length ; j ++){
                if( i >= 1) {
                    sum += nums[j];
                }else{
                    sum = nums[j];
                }

                if(sum >= max ){
                    max = sum;
                }

            }
        }
        return max;
    }
}
