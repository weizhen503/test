package leetcode.大学算法训练营.line.done;

/**
 * @date:2020/10/13 7:41
 * @version:1.0
 */
public class RotateArr189{
    public void rotate(int[] nums, int k){
//暴力解法
// for(int j = nums.length - 1 ; j >= nums.length - k ; j --){
//     int temp = nums[nums.length - 1];
//     for(int i = nums.length - 2 ;  i >= 0 ; i --){
//         nums[i + 1] = nums[i];
//     }
//     nums[0] = temp;
// }

//创建新数组法
// int newarr[] = new int[nums.length];
//  for(int i = 0 ; i < nums.length ; i ++){
//  newarr[(i+k)%nums.length] = nums[i];
//  }
// for(int i = 0 ; i < nums.length ; i ++){
//     nums[i] = newarr[i];
// }

//反转法
        k %= nums.length;
        reverse(nums,0,nums.length - 1);
        reverse(nums,0,k - 1);
        reverse(nums, k,nums.length-1);

    }

    public void reverse(int[]nums,int start,int end){
        while(start < end){
            int temp_end = nums[end];
            nums[end] = nums[start];
            nums[start] = temp_end;
            start ++;
            end --;
        }
    }
}

