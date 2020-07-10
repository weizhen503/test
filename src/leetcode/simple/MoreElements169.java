package leetcode.simple;

public class MoreElements169 {
    public static void main(String[] args) {
        int arr[ ] = {3,2,3};
        MoreElements169 text = new MoreElements169();
        System.out.println(text.majorityElement(arr));
    }
    // 输入: [1,1,1,2,2,2,2]
    //输出: 2

    /**
     * 先排序
     * 双重for循环  一部分一部分的计算  找出相同数字最后一个数的下标  （再+1） 就是下一个不同数
     *
     *
     */
    public int majorityElement(int[] nums) {
        int num = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[index]) {
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
            int k = 0;
        for (int j = 0; j < nums.length; j++) {
            int temp = nums [k];
            for (int i = k ; i < nums.length; i++) {
                if(temp == nums[i]){
                    k++;
                    if(k > num){
                        return nums[i];
                    }
                }
            }
        }
        return 0;
    }
}
