package leetcode.大学算法训练营.line.done;

public class MoveZeros283 {
    public static void main(String[] args) {

    }

    public void movezeros(int nums[]){
        //作为非零元素再数组中的下标
        int j = 0;
        //i下标所运行过来都为0;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                if(i != j){
                    nums[i] = 0;
                }
                j ++;
            }
        }
    }

}
