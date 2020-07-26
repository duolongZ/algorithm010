import java.util.Arrays;

/**
 * @author:huangzhen
 * @createTime:2020/7/23 22:52
 * @description:朋友圈
 */
public class FindCircleNum {

    int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    void union(int[] parent, int i, int j) {
        int xset = find(parent, i);
        int yset = find(parent, j);
        if (xset != yset) {
            parent[xset] = yset;
        }
    }

    /**
     * [[1,1,0],
     * [1,1,0],
     * [0,0,1]]
     *
     * @param M
     * @return
     */
    public int findCircleNum(int[][] M) {
        int[] parent = new int[M.length];
        Arrays.fill(parent, -1);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (M[i][j] == 1 && i != j){
                    union(parent,i,j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == -1){
                count++;
            }
        }
        return count;
    }


}
