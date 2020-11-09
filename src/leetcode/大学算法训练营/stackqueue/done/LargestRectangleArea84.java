package leetcode.大学算法训练营.stackqueue.done;

public class LargestRectangleArea84 {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 0){
            return 0;
        }
        int max = 0;
        for(int i = 0 ; i < heights.length ; i ++){
            int currentheight = heights[i];
            int left = i;
            while(left > 0 && heights[left - 1] >= currentheight){
                left = left - 1;
            }

            int right = i;
            while(right < heights.length - 1 && heights[right + 1]  >= currentheight){
                right = right + 1;
            }

            max = Math.max(max,currentheight * (right - left + 1));
        }
        return max;
    }
}
