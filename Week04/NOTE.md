学习笔记

    希望助教老师能够出一版java的DFS和BFS代码模板，有利于我们这些基础比较薄弱的同学能够更好的学习。
    
    深度优先搜索算法（Depth-First-Search）
    深度优先搜索算法（Depth-First-Search），是搜索算法的一种。它沿着树的深度遍历树的节点，尽可能深的搜索树的分支。
    当节点v的所有边都己被探寻过，搜索将回溯到发现节点v的那条边的起始节点。
    这一过程一直进行到已发现从源节点可达的所有节点为止。
   
    
    广度优先搜索算法（Breadth-First-Search），是一种图形搜索算法
    简单的说，BFS是从根节点开始，沿着树(图)的宽度遍历树(图)的节点。
    如果所有节点均被访问，则算法中止。
    BFS同样属于盲目搜索。
    一般用队列数据结构来辅助实现BFS算法。
    简单来说广度优先搜索按照层级搜索
    
    贪心算法 Greedy
        贪心算法是一种在每一步选择中都采取在当前状态下最好或最优（即最有利）的选择，
    从而希望导致结果是全局最好或最优的算法。
        贪心算法与动态规划的不同在于它的每个子问题的解决方案都做出选择，不能回退。动态
    规划则会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。
    
    二分查找/牛顿迭代法
    二分查找法实际上是对一个有序数组进行查找，每次取一半，判断要查找的值在哪个区域内，
    然后进行下一次搜索，
    left + (right - left)/2 求中间值，它的优势在于不会超出当前数组最大值的范围，防止越界
    而(right + left)/2 取到数组后两位时可能会出现越界的情况。
    
    牛顿迭代法
    牛顿迭代法更接近于数学中的几何问题。
    求解通常有3步：
    　　1.确定迭代变量，存在一个可直接或间接地不断由旧值递推出新值的变量，这个变量就是迭代变量。
    　　2.建立迭代关系式
    　　3.对迭代过程进行控制，也就是算法实现
   
   
````
BFS代码模板
//Java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if (root == null) {
        return allResults;
    }
    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
        int size = nodes.size();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = nodes.poll();
            results.add(node.val);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        allResults.add(results);
    }
    return allResults;
}
````

````
//DFS代码模板
public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if(root==null){
            return allResults;
        }
        travel(root,0,allResults);
        return allResults;
    }


    private void travel(TreeNode root,int level,List<List<Integer>> results){
        if(results.size()==level){
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        if(root.left!=null){
            travel(root.left,level+1,results);
        }
        if(root.right!=null){
            travel(root.right,level+1,results);
        }
    }
````

<h2>参考链接</h2>
<ul>
<li><a href="https://shimo.im/docs/UdY2UUKtliYXmk8t/" rel="noopener nofollow" target="_blank"> DFS 代码模板（递归写法、非递归写法）</a></li>
<li><a href="https://shimo.im/docs/ZBghMEZWix0Lc2jQ/" rel="noopener nofollow" target="_blank"> BFS 代码模板</a></li>
</ul>
<ul>
<li><a href="https://leetcode-cn.com/problems/coin-change/" rel="noopener nofollow" target="_blank"> coin change 题目</a></li>
<li><a href="https://zh.wikipedia.org/wiki/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92" rel="noopener nofollow" target="_blank">动态规划定义</a></li>
</ul>
<ul>
<li><a href="https://shimo.im/docs/xvIIfeEzWYEUdBPD/" rel="noopener nofollow" target="_blank">二分查找代码模板</a></li>
<li><a href="https://www.beyond3d.com/content/articles/8/" rel="noopener nofollow" target="_blank"> Fast InvSqrt() 扩展阅读</a></li>
</ul>

<div data-v-4b326be6="" class="article-typo" data-v-2c386447=""><h2 data-article-section="1">本周作业</h2>
<h3 data-article-section="1">简单：</h3>
<ul data-article-section="1">
<li><a href="https://leetcode-cn.com/problems/lemonade-change/description/" rel="noopener nofollow" target="_blank">柠檬水找零</a>（亚马逊在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/" rel="noopener nofollow" target="_blank">买卖股票的最佳时机 II </a>（亚马逊、字节跳动、微软在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/assign-cookies/description/" rel="noopener nofollow" target="_blank">分发饼干</a>（亚马逊在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/walking-robot-simulation/description/" rel="noopener nofollow" target="_blank">模拟行走机器人</a></li>
<li>使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方<br>
说明：同学们可以将自己的思路、代码写在第 4 周的学习总结中</li>
</ul>
<h3 data-article-section="1">中等：</h3>
<ul data-article-section="1">
<li><a href="https://leetcode-cn.com/problems/word-ladder/description/" rel="noopener nofollow" target="_blank">单词接龙</a>（亚马逊在半年内面试常考）</li>
<li><a href="https://leetcode-cn.com/problems/number-of-islands/" rel="noopener nofollow" target="_blank">岛屿数量</a>（近半年内，亚马逊在面试中考查此题达到 350 次）</li>
<li><a href="https://leetcode-cn.com/problems/minesweeper/description/" rel="noopener nofollow" target="_blank">扫雷游戏</a>（亚马逊、Facebook 在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/jump-game/" rel="noopener nofollow" target="_blank">跳跃游戏</a> （亚马逊、华为、Facebook 在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/search-in-rotated-sorted-array/" rel="noopener nofollow" target="_blank">搜索旋转排序数组</a>（Facebook、字节跳动、亚马逊在半年内面试常考）</li>
<li><a href="https://leetcode-cn.com/problems/search-a-2d-matrix/" rel="noopener nofollow" target="_blank">搜索二维矩阵</a>（亚马逊、微软、Facebook 在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/" rel="noopener nofollow" target="_blank">寻找旋转排序数组中的最小值</a>（亚马逊、微软、字节跳动在半年内面试中考过）</li>
</ul>
<h3 data-article-section="1">困难</h3>
<ul data-article-section="1">
<li><a href="https://leetcode-cn.com/problems/word-ladder-ii/description/" rel="noopener nofollow" target="_blank">单词接龙 II </a>（微软、亚马逊、Facebook 在半年内面试中考过）</li>
<li><a href="https://leetcode-cn.com/problems/jump-game-ii/" rel="noopener nofollow" target="_blank">跳跃游戏 II </a>（亚马逊、华为、字节跳动在半年内面试中考过）</li>
</ul>
<h2 data-article-section="1">第 6 周预习</h2>
<h3 data-article-section="1">预习题目：</h3>
<ul data-article-section="1">
<li><a href="https://leetcode-cn.com/problems/longest-common-subsequence/" rel="noopener nofollow" target="_blank">最长公共子序列题目</a></li>
<li><a href="https://leetcode-cn.com/problems/triangle/description/" rel="noopener nofollow" target="_blank">三角形最小路径和</a></li>
<li><a href="https://leetcode-cn.com/problems/maximum-subarray/" rel="noopener nofollow" target="_blank">最大子序和</a></li>
<li><a href="https://leetcode-cn.com/problems/house-robber/" rel="noopener nofollow" target="_blank">打家劫舍</a></li>
</ul></div>