package Sword2offer;

public class JumpFloorII9 {

    public int JumpFloorII(int target){
        int num = 2;
        int result = (int) Math.pow(num,target - 1);
        return result;
    }
}
