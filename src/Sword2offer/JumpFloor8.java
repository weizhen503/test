package Sword2offer;

public class JumpFloor8 {

    public int JumpFloor(int target) {
        if(target == 1 || target == 2){
            return target;
        }
        int methodone = 1;
        int methodtwo = 2;
        int sum = 0;
        int i = 3;
        while(i <= target){
            sum = methodone + methodtwo;
            methodone = methodtwo;
            methodtwo = sum;
            i ++;
        }
        return sum;
    }
}
