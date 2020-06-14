package leetcode.simple;

public class UniteTwoArray88 {
    public static void main(String[] args) {
        UniteTwoArray88 text = new UniteTwoArray88();
        int nums1[] = new int[]{2,3,4};
        int m = 3 ;
        int nums2[] = new int[]{2,5,6};
        int n = 3 ;
        text.merge(nums1,m,nums2,n);

    }
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6]

    public void merge(int[] nums1, int m, int[] nums2, int n) {
           int temp[] = new int[m+n];
           int l = 0;
           for(int i =0 ; i < temp.length ; i ++){
                    if(i>=m){
                        temp [i] = nums2[l];
                        l++;
                    }else{
                        temp [i] = nums1[i];
                    }
               }

           for(int j = 0 ; j < temp.length ; j ++){
               int index = j ;
               for(int k = j+1 ;k < temp.length ; k ++ ){
                   if(temp[index] > temp[k]){
                       index = k;
                   }
               }
               int tempvalue = temp[j];
               temp[j] = temp[index];
               temp[index] = tempvalue;
               nums1[j] = temp[j];
           }
           }
    }

/**
 * 另一种方法：
 *  让数组2的元素从最小开始与数组1最大的比。每次都会使得数组1的元素加1
 * public void merge(int[] nums1, int m, int[] nums2, int n) {
 *        for(int i = 0 ; i < n ; i ++){
 *            int j = m;
 *
 *            while( j > 0 ){
 *                if(nums2[ i ] >= nums1[ j - 1 ]){
 *                    break;
 *                }else{
 *                    nums1[ j ] = nums1[ j - 1 ];
 *                    j --;
 *                }
 *            }
 *            nums1[j] = nums2[i];
 *            //每次增加数组1的元素个数1个；
 *            m ++;
 *        }
 *     }
 */
