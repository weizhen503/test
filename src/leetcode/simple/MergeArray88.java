package leetcode.simple;

public class MergeArray88 {
    /**
     * 1.重创建1个数组大小为m+n
     * 2.将第一个和第二个的数组添加入新数组 第二个数组加到第一个数组后面 需要多一个数记录下标
     * 3.对新数组选择排序
     * 4.再把新数组赋值给nums1
     */

    public static void main(String[] args) {
        int []num = {1,2,3,4,5,6};
        num = new int[9];
        for(int i = 0 ; i < 9 ; i ++){
            System.out.println(num[i]);
        }
    }
}
