package Sword2offer;

public class Quick_sort {
    public void quickSort(int[] arr,int low,int high) {
        if(low > high){
            return ;
        }
        int i = low;
        int j = high;
        int temp = arr[low];
        while(i < j){
            while(temp <= arr[j] && i < j ){
                j --;
            }

            while(temp >= arr[i] && i < j ){
                i ++;
            }

            if(i < j){
                int temp_other = arr[i];
                arr[i] = arr[j];
                arr[j] = temp_other;
            }

        }
        arr[low] = arr[i];
        arr[i] = temp;

        quickSort(arr,low,j - 1);
        quickSort(arr,j + 1,high);
    }

    public static void main(String[] args) {
        int arr[] = {6,1,2,7,9,3,4,5,10,8};
        new Quick_sort().quickSort(arr,0,arr.length - 1);
        for(int i = 0 ; i < arr.length ; i ++){
            System.out.println(arr[i]);
        }
    }
    }
