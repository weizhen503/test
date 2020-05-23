package leetcode.simple;

public class Simple26 {
    public static void main(String[] args) {
        Simple26 sim26 = new Simple26();
        int []arr = {0,0,1,1,1,2,3,4,7};
        System.out.println(arr);
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int label = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[label] != nums[i]) {
                label++;
                nums[label] = nums[i];
            }
        }
        //加1是因为label是从0开始的
        return label + 1;
    }
}