package leetcode.大学算法训练营.line.todo;

/**
 * 资料：https://labuladong.gitbook.io/algo/gao-pin-mian-shi-xi-lie/jie-yu-shui
 */
public class MaxArea11 {

    public int maxArea(int[] height) {
        int leftbar;
        int rightbar;
        int area = 0;
        int max= 0;
        for(leftbar = 0, rightbar = height.length-1 ; leftbar < rightbar ;   ){
            int minHeight = height[leftbar] < height[rightbar] ? height[leftbar ++]:height[rightbar --];
            area = (rightbar-leftbar+1)*minHeight;
            max=Math.max(max,area);
        }
        return max;
    }

}
