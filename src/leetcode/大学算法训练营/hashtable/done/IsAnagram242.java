package leetcode.大学算法训练营.hashtable.done;

/**
 * @author: wzx
 * @date:2020/11/9 12:57
 * @version:1.0
 */
public class IsAnagram242 {
    /**
     *新创数组的方法
     * 将两个形参转化为char数组，把字符转化为数值存入新数组。计算数字出现的次数，如果最后的结果出现不为0的情况，表明
     * 存在有不相同的字母，此时返回false；
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] ch = new int[26];
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        for(int i = 0 ; i < s.length() ; i ++){
            ch[sch[i] - 'a']++;
            ch[tch[i] - 'a']--;
        }
        for (int temp : ch) {
            if(temp != 0){
                return false;
            }
        }
        return true;
    }
    /**
     * 暴力解法
     * 先排序，再for循环逐个比较
     */
}

