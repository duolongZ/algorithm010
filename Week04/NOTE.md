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