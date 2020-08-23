学习笔记
    本周主要学习了递归、分治算法、回溯算法、分治和回溯还有递归最后本质上都是找重复性以及分解问题 最后组合结果这么一个思路
    
    递归-循环
        通过函数体快速进行的循环
        向下进入到不同的递归层，向上又回到原来一层
        通过声音同步到上一层
        每一层的环境和周围的人都是一份拷贝（发生和携带变化，就是传入的参数）
    误区：
        不要人肉递归，这是最大误区。
        找到最近最简的方法，将其拆解成可重复解决的问题。
        数学归纳法思维
      
    分治    
        简单来说就是把复杂的问题拆解成多个相同或相似的子问题，再把子问题拆解成更小的子问题，直到最后
     子问题可直接求解出答案，原来的解即子问题的解的合并。
     
     回溯
        回溯不同于分治，虽然都可以说是递归，但是回溯算法在递归中发现不满足求解条件时会返回，尝试别的路径。

<li><h2>代码模板</h2>
<ul>
<li><a href="https://shimo.im/docs/EICAr9lRPUIPHxsH/" rel="noopener nofollow" target="_blank">递归代码模板</a></li>
<li><a href="https://shimo.im/docs/zvlDqLLMFvcAF79A/" rel="noopener nofollow" target="_blank">分治代码模板</a></li>
</ul>
<ul>
<li><a href="http://www.matrix67.com/blog/archives/361" rel="noopener nofollow" target="_blank">牛顿迭代法原理</a></li>
<li><a href="http://www.voidcn.com/article/p-eudisdmk-zm.html" rel="noopener nofollow" target="_blank">牛顿迭代法代码</a></li>
</ul>


<li><h2>代码练习</h2>
<ul data-article-section="1">
<li><a href="https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/" rel="noopener nofollow" target="_blank">二叉树的最近公共祖先</a>（Facebook 在半年内面试常考）</li>
<li><a href="https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/" rel="noopener nofollow" target="_blank">从前序与中序遍历序列构造二叉树</a>（字节跳动、亚马逊、微软在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/combinations/" rel="noopener nofollow" target="_blank">组合</a>（微软、亚马逊、谷歌在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/permutations/" rel="noopener nofollow" target="_blank">全排列</a>（字节跳动在半年内面试常考）</li>
<li><a href="https://leetcode-cn.com/problems/permutations-ii/" rel="noopener nofollow" target="_blank">全排列 II </a>（亚马逊、字节跳动、Facebook 在半年内面试中考过）</li>
</ul>        

<ul data-article-section="1">
<li><a href="http://leetcode-cn.com/problems/binary-tree-level-order-traversal/#/description" rel="noopener nofollow" target="_blank">二叉树的层次遍历</a></li>
<li><a href="http://leetcode-cn.com/problems/assign-cookies/description/" rel="noopener nofollow" target="_blank">分发饼干</a></li>
<li><a href="http://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/" rel="noopener nofollow" target="_blank">买卖股票的最佳时机 II </a></li>
<li><a href="http://leetcode-cn.com/problems/jump-game/" rel="noopener nofollow" target="_blank">跳跃游戏</a></li>
<li><a href="http://leetcode-cn.com/problems/sqrtx/" rel="noopener nofollow" target="_blank"> x 的平方根</a></li>
<li><a href="http://leetcode-cn.com/problems/valid-perfect-square/" rel="noopener nofollow" target="_blank">有效的完全平方数</a></li>
</ul>