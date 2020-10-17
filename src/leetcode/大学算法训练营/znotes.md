1. 把大概注释写一下，拷贝的代码不要答案里或者注释一下，不然分不清哪些是自己写的

141题
public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            //这个if语句为什么要两次判断fast
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
  
141判断一个链表是不是循环链表
快慢双指针法  fast=fast.next.next slow=slow.next；
    
142给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
1先判断该链表是否是循环单链表
1).head为空或者head.next为空直接输出不是循环单链表，即是能否相遇问题，使用快慢指针，如果相遇就是循环单链表
2).如果是循环单链表，第一次相遇过来，将head赋值给fast，且fast的运行速度和slow一样快，当fast和slow再次相遇时，输出fast或slow鸡是。

11容器盛水体积最大问题
双指针：两边夹逼法

88题两个有序数组合并成为1个有序数组
从后往前进行比较，设置两个变量 i=m-1 j=n-1; 表示两个链表分别所剩元素个数

283将数组中的零移动到最后的问题
创建一个整型变量j 用来作为存储非0元素的下标 

206反转单链表
需要三个指针 pre node next   node表示正在被处理的节点

189旋转数组问题
三次反转

15三数之和为0，并返回3个数字问题
List<List<Integer>> res = new ArrayList<>();
res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
三指针k ; i = k + 1 ;j = nums.length - 1 先排序Arrays.sort() 
 ！！！！！在循环中排序过后如果arr[k]>0 则可以结束程序
 ！！！！！！当k>0并且arr[k]==arr[k-1]时跳过此次循环
！！三数之和大于0
！！三数之和小于0
！！三数之和等于0
