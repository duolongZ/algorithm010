import java.util.Arrays;

/**
 * @author:huangzhen
 * @createTime:2020/7/19 21:23
 * @description:任务调度器
 */
public class LeastInterval {

    public int leastInterval(char[] tasks, int n) {
        int[] result = new int[26];
        for (char task : tasks) {
            result[task - 'A']++;
        }
        Arrays.sort(result);
        int time = 0;
        while (result[25] > 0){
            int i = 0;
            while (i <= n){
                if (result[25] == 0){
                    break;
                }
                if (i < 26 && result[25 - i] > 0){
                    result[25 - i]--;
                }
                i++;
                time++;
            }
            Arrays.sort(result);
        }
        return time;
    }

}
