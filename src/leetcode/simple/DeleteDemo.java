package leetcode.simple;

public class DeleteDemo {

    public static void main(String[] args) {
        DeleteDemo demo = new DeleteDemo();
        int []arr={0,0,1,1,1,2,3,4,4,5};
        System.out.println( demo.removeDuplicates(arr));
    }

    /**
     * 1.用for循环匹配并掩盖重复项，再记录有几种数
     */


    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ){
            return 0;
        }
        int label = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[label] != nums[i]){
                label ++;
                nums[label] = nums[i];
            }
        }
        //加1是因为label是从0开始的
        return label+1;
    }
}

