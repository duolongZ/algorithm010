学习笔记

    本周主要学习了哈希表、集合、树、二叉树、二叉搜索树
    
    哈希表（Hash table）也叫散列表，是根据关键码值（Key value）而直接进行访问的数据结构。 它通过把关键码值映射到表中一个位置来访问记录，以加快查找的速度。 这个映射函数叫做散列函数，存放记录的数组叫做哈希表（散列表）。 哈希碰撞：不同的值，经过哈希换数之后会得到一个相同的值。 解决哈希碰撞的办法：在发生碰撞的位置放入一个链表，也就是拉链式解决冲突法。将相同哈希值的位置存放对应元素的列表，哈希函数的查询时间复杂度是O(1)的，增加、删除、查询时间复杂度均为O(1),最坏情况下为O(n) java中对应的就是Map(key-value对，key不重复)和Set(不重复元素的集合)
    
    HashMap实现原理
    
    HashMap基于Map接口实现、允许null键/值、非同步、不保证有序(比如插入的顺序)、也不保证序不随时间变化。
    
    两个重要的参数:
    Capacity就是buckets的数目，Load factor就是buckets填满程度的最大比例。如果对迭代性能要求很高的话不要把capacity设置过大，也不要把load factor设置过小。当bucket填充的数目（即hashmap中元素的个数）大于capacity*load factor时就需要调整buckets的数目为当前的2倍。
    
    HashMap的主干是一个Node数组。java8新加了红黑树。Node是HashMap的基本组成单元，每一个Entry包含一个key-value键值对。 简单来说，HashMap由数组+链表+红黑树实现的。 HashMap使用哈希表来存储。
    
    HashMap的数组长度一定是2的次幂。
    
    HashMap线程不安全,put的时候多线程可能会导致数据不一致；自动扩容时可能出现多个线程同时修改链表结构。
    
    二叉搜索树（Binary Search Tree）：
    它或者是一棵空树，或者是具有下列性质的二叉树： 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。二叉搜索树作为一种经典的数据结构，它既有链表的快速插入与删除操作的特点，又有数组快速查找的优势
    
<li><h2>参考链接</h2>
<ul>
<li>连通图个数：<a href="https://leetcode-cn.com/problems/number-of-islands/" rel="noopener nofollow" target="_blank"> https://leetcode-cn.com/problems/number-of-islands/ </a></li>
<li>拓扑排序（Topological Sorting）：<a href="https://zhuanlan.zhihu.com/p/34871092" rel="noopener nofollow" target="_blank"> https://zhuanlan.zhihu.com/p/34871092 </a></li>
<li>最短路径（Shortest Path）：Dijkstra <a href="https://www.bilibili.com/video/av25829980?from=search&amp;seid=13391343514095937158" rel="noopener nofollow" target="_blank"> https://www.bilibili.com/video/av25829980?from=search&amp;seid=13391343514095937158 </a></li>
<li>最小生成树（Minimum Spanning Tree）：<a href="https://www.bilibili.com/video/av84820276?from=search&amp;seid=17476598104352152051" rel="noopener nofollow" target="_blank"> https://www.bilibili.com/video/av84820276?from=search&amp;seid=17476598104352152051 </a></li>
</ul>

<li><h2>堆和二叉堆参考链接</h2>
<ul>
<li><a href="https://en.wikipedia.org/wiki/Heap_(data_structure)" rel="noopener nofollow" target="_blank">维基百科：堆（Heap）</a></li>
<li>堆的实现代码：<a href="https://shimo.im/docs/Lw86vJzOGOMpWZz2/" rel="noopener nofollow" target="_blank"> https://shimo.im/docs/Lw86vJzOGOMpWZz2/ </a></li>
</ul>

<ul>
<li><a href="https://visualgo.net/zh/bst" rel="noopener nofollow" target="_blank">二叉搜索树 Demo </a></li>
</ul>

<div data-v-4b326be6="" class="article-typo" data-v-2c386447=""><h2 data-article-section="1">本周作业</h2>
<h3 data-article-section="1">简单：</h3>
<ul data-article-section="1">
<li>写一个关于 HashMap 的小总结。<br>
说明：对于不熟悉 Java 语言的同学，此项作业可选做。</li>
<li><a href="https://leetcode-cn.com/problems/valid-anagram/description/" rel="noopener nofollow" target="_blank">有效的字母异位词</a>（亚马逊、Facebook、谷歌在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/two-sum/description/" rel="noopener nofollow" target="_blank">两数之和</a>（近半年内，亚马逊考查此题达到 216 次、字节跳动 147 次、谷歌 104 次，Facebook、苹果、微软、腾讯也在近半年内面试常考）</li>
<li><a href="https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/" rel="noopener nofollow" target="_blank"> N 叉树的前序遍历</a>（亚马逊在半年内面试中考过）</li>
<li>HeapSort ：自学 <a href="https://www.geeksforgeeks.org/heap-sort/" rel="noopener nofollow" target="_blank"> https://www.geeksforgeeks.org/heap-sort/ </a></li>
</ul>
<h3 data-article-section="1">中等：</h3>
<ul data-article-section="1">
<li><a href="https://leetcode-cn.com/problems/group-anagrams/" rel="noopener nofollow" target="_blank">字母异位词分组</a>（亚马逊在半年内面试中常考）</li>
<li><a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal/" rel="noopener nofollow" target="_blank">二叉树的中序遍历</a>（亚马逊、字节跳动、微软在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/" rel="noopener nofollow" target="_blank">二叉树的前序遍历</a>（字节跳动、谷歌、腾讯在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/" rel="noopener nofollow" target="_blank"> N 叉树的层序遍历</a>（亚马逊在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/chou-shu-lcof/" rel="noopener nofollow" target="_blank">丑数</a>（字节跳动在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/top-k-frequent-elements/" rel="noopener nofollow" target="_blank">前 K 个高频元素</a>（亚马逊在半年内面试中常考）</li>
</ul>
<h2 data-article-section="1">下周预习</h2>
<h3 data-article-section="1">预习题目：</h3>
<ul data-article-section="1">
<li><a href="https://leetcode-cn.com/problems/climbing-stairs/" rel="noopener nofollow" target="_blank">爬楼梯</a></li>
<li><a href="https://leetcode-cn.com/problems/generate-parentheses/" rel="noopener nofollow" target="_blank">括号生成</a></li>
<li><a href="https://leetcode-cn.com/problems/powx-n/" rel="noopener nofollow" target="_blank"> Pow(x, n) </a></li>
<li><a href="https://leetcode-cn.com/problems/subsets/" rel="noopener nofollow" target="_blank">子集</a></li>
<li><a href="https://leetcode-cn.com/problems/n-queens/" rel="noopener nofollow" target="_blank"> N 皇后</a></li>
</ul></div>