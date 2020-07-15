package leetcode.simple;

public class RotateArray189 {
    public static void main(String[] args) {
        RotateArray189 test = new RotateArray189();
        int arr[] = {7,1,2,3,4,5,6};
        test.rotate(arr,3);

    }

    public void rotate(int[] nums, int k) {
        int temp ;
        for(int i = 1 ; i <= k ; i++){
            temp = nums[ nums.length - 1 ];
            for(int j = nums.length - 1 ; j >= 1 ; j --){
               nums[j] = nums[j - 1];
               if(j == 1 ){
                   nums[j-1] = temp;
               }
            }
        }
    }
}
