package leetcode.大学算法训练营.hashtable.done;

import datastruct.Array;

import java.util.*;

/**
 * @author: wzx
 * @date:2020/11/9 12:58
 * @version:1.0
 */

/**
 * 哈希表法
 * 对数组中的每个元素依次进行转字符数组再排序，再获得排序后的字符串
 * 将排序后的字符串作为键值的映射，当哈希表中不存在该映射时->put
 * 当该映射存在时，将该数值存入链表中
 */
public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length ; i ++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String value = String.valueOf(temp);
            if(!map.containsKey(value)){
                map.put(value,new ArrayList<>());
            }
            map.get(value).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
