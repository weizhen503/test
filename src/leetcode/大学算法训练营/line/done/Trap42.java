package leetcode.大学算法训练营.line.done;

public class Trap42 {

    /**
     *
     * @param height
     * @return
     *
     * 接雨水问题
     * 利用双指针来求解
     * 首首先先找出最高的柱子的“下标”
     * 然后分别对该柱子的左边和右边用双指针遍历
     * 左边初始化 left == right = 0;
     * 右边初始化 left == right = height.length - 1;
     * 然后统计height[left] - height[right]的差值
     *
     */


    public int trap(int[] height) {
        int max = 0;
        int sum = 0;
        int len = height.length;
        /**
         * 下面的判断条件很容易被忽略掉
         * 要注意
         */
        if(len <= 2){
            return 0;
        }
        int maxHeight = 0;
        for(int i = 0 ; i < len ; i ++){
            if(height[i] > max){
                max = height[i];
                maxHeight = i;
            }
        }

        //左边遍历
        int left = 0;
        for(int right = 0 ; right <= maxHeight ; right ++){
            if(height[right] < height[left]){
                sum +=(height[left] - height[right]);
            }

            if(height[right] > height[left]){
                left = right;
            }
        }

        int right = len - 1;
        for(int left_other = len - 1; left_other >= maxHeight ; left_other -- ){
            if(height[left_other] < height[right]){
                sum += (height[right] - height[left_other]);
            }

            if(height[left_other] > height[right]){
                right = left_other;
            }
        }

        return sum;
    }
}
