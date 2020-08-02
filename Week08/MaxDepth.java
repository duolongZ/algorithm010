import java.util.*;

/**
 * @author:huangzhen
 * @createTime:2020/7/28 13:19
 * @description:
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right)+1;
        }
    }

    public int integerBreak(int n) {
        int l = 0;
        if (n<6){
            l = 6;
        }else {
            l = n;
        }
        int[] dp = new int[l];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        dp[4] = 6;
        dp[5] = 9;
        for (int i = 6; i < n; i++) {
            int m = 1;
            while (i > m) {
                dp[i] = Math.max(dp[i], m * dp[i - m]);
                m++;
            }
        }
        return dp[n - 1];
    }

    public int[] smallestRange(List<List<Integer>> nums) {
        int rangeLeft = 0, rangeRight = Integer.MAX_VALUE;
        int minRange = rangeRight - rangeLeft;
        int max = Integer.MIN_VALUE;
        int size = nums.size();
        int[] next = new int[size];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer index1, Integer index2) {
                return nums.get(index1).get(next[index1]) - nums.get(index2).get(next[index2]);
            }
        });
        for (int i = 0; i < size; i++) {
            priorityQueue.offer(i);
            max = Math.max(max, nums.get(i).get(0));
        }
        while (true) {
            int minIndex = priorityQueue.poll();
            int curRange = max - nums.get(minIndex).get(next[minIndex]);
            if (curRange < minRange) {
                minRange = curRange;
                rangeLeft = nums.get(minIndex).get(next[minIndex]);
                rangeRight = max;
            }
            next[minIndex]++;
            if (next[minIndex] == nums.get(minIndex).size()) {
                break;
            }
            priorityQueue.offer(minIndex);
            max = Math.max(max, nums.get(minIndex).get(next[minIndex]));
        }
        return new int[]{rangeLeft, rangeRight};
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        TreeNode right = treeNode.right;
        right.left = new TreeNode(4);
        right.right = new TreeNode(5);
        MaxDepth maxDepth = new MaxDepth();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(treeNode);
        int i = maxDepth.maxDepth(treeNode);
//        System.out.println(i);
        int i1 = maxDepth.integerBreak(2);
        System.out.println(i1);
    }
}
