package leetcode.simple;

public class OpenOnce136 {
    public static void main(String[] args) {
        OpenOnce136 text = new OpenOnce136();
        int arr[]={2,2,1};
        System.out.println(text.singleNumber(arr));
    }
    //[4,1,2,1,2] 再数组中找出只出现1次的数字
    //[2,2,1]
    /**
     * 双for指针 第一个for指着需要判断出现几次的数字，第二个for指向全部判断是否与第一个相同
     * 用label记住出现的次数
     *
     *
     */
    public int singleNumber(int[] nums) {

        for(int i = 0 ; i < nums.length ; i ++ ){
            int label = 0;
            for(int j = 0 ; j < nums.length ; j ++){
                if(nums[i] == nums[j]){
                    label ++;
                }
            }
            if(label == 1){
                return nums[i];
            }
        }
        return 0;
    }
}
