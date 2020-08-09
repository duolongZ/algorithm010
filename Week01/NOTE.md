学习心得:
     
     本周主要学习了几种数据结构，主要包括数组、链表、跳表、栈、队列、优先队列、双端队列以及时间复杂度和空间复杂度的判断。
     
     时间复杂度：
     O(1) constant complexity 常数复杂度
     O(log_n) loggarith complexity 对数复杂度
     O(n) linear complexity 线性时间复杂度
     O(n^2) N square complexity 平方时间复杂度
     O(n^3) N cubic complexity 立方时间复杂度
     O(2^n) exponential complexity 指数时间复杂度
     O(n!) factorial complexity 阶乘时间复杂度
     
     平时写工程代码从未关心过时间复杂度，在上过覃超老师的课后，了解到了时间复杂度的高低对系统带来的性能消耗也是不一样的，能尽量简化时间复杂度就简化下。
     
     数组（Array）
     定义：数组(Array)是一种线性表数据结构。它用一组连续的内存空间，来存储一组具有相同类型的数据。
     
     线性表(Linear list)
     连续内存空间
     相同数据类型
     1.1 线性表中的元素只有前后两个方向。
     
     1.2 连续内存空间很适合利用 CPU 缓存。
     
     1.3 连续内存空间 与 相同数据类型 造就了数组的随机访问特性，计算机可以通过下面的寻址公式查到下标为 i 的元素的内存地址： a[i]_address = base_address + i * data_type_size。
     
     时间复杂度：
     
     插入/删除元素：O(n)
     按下标随机访问：O(1)
     2.1 插入/删除 均涉及到部分数据的搬移作为先决操作,所以低效。
     
     链表（Linked list）
     定义：链表(Linked list)是一种线性表数据结构。它通过“指针”将一组零散的内存块串联起来使用。
     
     线性表(Linear list)
     零散内存空间
     类型:
     
     单链表：每个结点只有一个后继指针 next，尾节点后继指针为nil
     双向链表：每个结点有一个前驱指针 prev 和一个后继指针 next，尾节点后继指针为nil
     循环链表：特殊的单链表，尾节点后继指针为首结点
     双向循环链表：特殊的双向链表，首节点的 prev 指针为尾节点，尾节点 next 指针为首结点
     时间复杂度：
     
     插入/删除元素：O(1)
     随机访问元素：O(n)
     栈（Stack）
     定义：栈（Stack）是一种操作受限的线性表数据结构。先进后出，后进先出。
     
     线性表(Linear list)
     操作受限
     LIFO
     1.1 操作受限——只允许在一端插入和删除数据。
     
     实现：
     
     顺序栈（基于数组实现）
     链式栈（基于链表实现）
     队列（Queue）
     定义：队列是一种操作受限的线性表数据结构。先进先出，后进后出。
     
     线性表(Linear list)
     操作受限
     FIFO
     1.1 操作受限——只允许在一端插入另一端删除数据。
     
     
 <p><strong>参考链接</strong></p>
     <ul>
     <li><a href="http://developer.classpath.org/doc/java/util/ArrayList-source.html" rel="nofollow">Java 源码分析</a> (ArrayList) </li>
     <li><a href="https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/" rel="nofollow">Linked List 的标准实现代码</a></li>
     <li><a href="http://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/code/LinkedList.java" rel="nofollow">Linked List 示例代码</a></li>
     <li><a href="http://developer.classpath.org/doc/java/util/LinkedList-source.html">Java 源码分析（LinkedList）</a></li>
     <li><a href="https://leetcode-cn.com/problems/lru-cache/" rel="nofollow"> LRU 缓存机制</a></li>
     <li><a href="https://redisbook.readthedocs.io/en/latest/internal-datastruct/skiplist.html" rel="nofollow">跳跃表、为啥 Redis 使用跳表（Skip List）而不是使用 Red-Black？</a></li>
     </ul> 
     
        
  <h2><strong>Array 实战题目</strong></h2>
     <ul>
     <li><a href="https://leetcode-cn.com/problems/two-sum/" rel="noopener nofollow" target="_blank">两数之和</a>（近半年内，字节跳动在面试中考查此题达到 152 次）</li>
     <li><a href="https://leetcode-cn.com/problems/container-with-most-water/" rel="noopener nofollow" target="_blank">盛最多水的容器</a>（腾讯、百度、字节跳动在近半年内面试常考）</li>
     <li><a href="https://leetcode-cn.com/problems/move-zeroes/" rel="noopener nofollow" target="_blank">移动零</a>（华为、字节跳动在近半年内面试常考）</li>
     <li><a href="https://leetcode.com/problems/climbing-stairs/" rel="noopener nofollow" target="_blank">爬楼梯</a>（阿里巴巴、腾讯、字节跳动在半年内面试常考）</li>
     <li><a href="https://leetcode-cn.com/problems/3sum/" rel="noopener nofollow" target="_blank">三数之和</a>（国内、国际大厂历年面试高频老题）</li>
     </ul>
     
   <h2>Linked List 实战题目</h2>
   <ul>
   <li><a href="https://leetcode.com/problems/reverse-linked-list/" rel="noopener nofollow" target="_blank">反转链表</a>（字节跳动、亚马逊在半年内面试常考）</li>
   <li><a href="https://leetcode.com/problems/swap-nodes-in-pairs" rel="noopener nofollow" target="_blank">两两交换链表中的节点</a>（阿里巴巴、字节跳动在半年内面试常考）</li>
   <li><a href="https://leetcode.com/problems/linked-list-cycle" rel="noopener nofollow" target="_blank">环形链表</a>（阿里巴巴、字节跳动、腾讯在半年内面试常考）</li>
   <li><a href="https://leetcode.com/problems/linked-list-cycle-ii" rel="noopener nofollow" target="_blank">环形链表 II </a></li>
   <li><a href="https://leetcode.com/problems/reverse-nodes-in-k-group/" rel="noopener nofollow" target="_blank"> K 个一组翻转链表</a>（字节跳动、猿辅导在半年内面试常考）</li>
   </ul>  
   
   <h2>实战题目</h2>
   <ul>
   <li><a href="https://leetcode-cn.com/problems/largest-rectangle-in-histogram" rel="noopener nofollow" target="_blank">柱状图中最大的矩形</a>（亚马逊、微软、字节跳动在半年内面试中考过）</li>
   <li><a href="https://leetcode-cn.com/problems/sliding-window-maximum" rel="noopener nofollow" target="_blank">滑动窗口最大值</a>（亚马逊在半年内面试常考）</li>
   </ul>
   
   <h2>课后作业</h2>
   <ul>
   <li>用 add first 或 add last 这套新的 API 改写 Deque 的代码</li>
   <li>分析 Queue 和 Priority Queue 的源码</li>
   <li><a href="https://leetcode.com/problems/design-circular-deque" rel="noopener nofollow" target="_blank">设计循环双端队列</a>（Facebook 在 1 年内面试中考过）</li>
   <li><a href="https://leetcode.com/problems/trapping-rain-water/" rel="noopener nofollow" target="_blank">接雨水</a>（亚马逊、字节跳动、高盛集团、Facebook 在半年内面试常考）</li>
   </ul>
   <p>说明：改写代码和分析源码这两项作业，同学们需要在第 1 周的学习总结中完成。如果不熟悉 Java 语言，这两项作业可选做。</p>