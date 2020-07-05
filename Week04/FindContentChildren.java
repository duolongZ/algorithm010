import java.util.Arrays;

/**
 * @author:huangzhen
 * @createTime:2020/7/5 20:11
 * @description:分发饼干
 */
public class FindContentChildren {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i =0,j=0;i<g.length && j<s.length;){
            if (s[j] >= g[i]){
                i++;
                count++;
            }
            j++;
        }
        return count;
    }
}
