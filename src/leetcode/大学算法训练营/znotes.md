1. 把大概注释写一下，拷贝的代码不要答案里或者注释一下，不然分不清哪些是自己写的

141题
public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            //这个if语句为什么要两次判断fast   A: 因为快指针肯定比慢指针先到链表的末尾，如果快指针为空，或者快指针的下一个节点为空，说明链表没用环，直接返回false;
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
  
141判断一个链表是不是循环链表 (是不是有环)
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
特别要注意k与nums.length的关系
当K > nums.length时 求余数 k%=nums.length   例如  当数组长度为5时，K为7，此时数组只要往右移动2次的结果与数组往右移动7次的结果相同  所以  要巧妙的运用余数

15三数之和为0，并返回3个数字问题
List<List<Integer>> res = new ArrayList<>();
res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
三指针k ; i = k + 1 ;j = nums.length - 1 先排序Arrays.sort() 
 ！！！！！在循环中排序过后如果arr[k]>0 则可以结束程序
 ！！！！！！当k>0并且arr[k]==arr[k-1]时跳过此次循环
！！三数之和大于0
！！三数之和小于0
！！三数之和等于0

21合并两个有序链表
需要另外创建一个链表对象。
有多种情况需要考虑：
(l1 != null && l2 == null)
(l2 != null && l1 == null)
(l1.val < l2.val)

26删除有序数组中的重复元素，并返回元素个数(类似零的移动问题283)
用双指针法 当nums[p] != nums[q]时 将nums[q]赋值给nums[p + 1] 然后 (p ++) (q ++)
当nums[p] == nums[q] q ++;

66题 加1问题
从后往前先对每个数字++后再取余判断是否为0 如果不为0 直接返回 如果为0 继续进行循环  若最后都为0 则扩增数组 index为0的位置设置为1

01两数之和==target问题
利用hasmap 数组值作为Key 下标作为value


25按k反转链表问题   （困难难度）
链表分区为已翻转部分+待翻转部分+未翻转部分
每次翻转前，要确定翻转链表的范围，这个必须通过 k 此循环来确定
需记录翻转链表前驱和后继，方便翻转完成后把已翻转部分和未翻转部分连接起来
初始需要两个变量 pre 和 end，pre 代表待翻转链表的前驱，end 代表待翻转链表的末尾
经过k此循环，end 到达末尾，记录待翻转链表的后继 next = end.next
翻转链表，然后将三部分链表连接起来，然后重置 pre 和 end 指针，然后进入下一次循环
特殊情况，当翻转部分长度不足 k 时，在定位 end 完成后，end==null，已经到达末尾，说明题目已完成，直接返回即可

20题有效的括号
用栈解

155最小栈
用辅助栈解

- 困难 84. 柱状图中最大的矩形
暴力解法 遍历 找出所有  heights[right + 1]  >= currentheight  和   (left > 0 && heights[left - 1] >= currentheight) 
最后找出满足条件最左和最右的下标   再计算面积即可。
