package Sword2offer;

public class SearchMinNumInArray {
    public static void main(String[] args) {

    }

    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0 ){
            return 0;
        }
    int p1 = 0;
    int p2 = array.length - 1;
    int mid = 0;
    while(array[p1] >= array[p2]){
        if(p2 - p1 == 1){
            mid = p2;
            break;
        }
        mid = (p2+p1)/2;
        //当p1、p2和mid下标的元素都相等时，则必须使用顺序查找
        if(array[p1] == array[p2] && array[p1] == array[mid]){
            int result = array[p1];
            for(int i = p1 + 1 ; i < p2 ; i ++){
                if(result > array[i]){
                    result = array[i];
                    return result;
                }
            }
        }
        if(array[p1] <= array[mid] ){
            p1 = mid;
        }else if(array[p2] >= array[mid]){
            p2 = mid;
        }
    }
    return array[mid];
    }
}
