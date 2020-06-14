import java.util.HashMap;
import java.util.Map;

/**
 * @author huangzhen
 * @date 2020/6/13 17:13
 */
public class TwoSum {

    /**
     *示例:
     *
     *  给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        int[] dp = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])){
                dp[0] = i;
                dp[1] = map.get(target - nums[i]);
                break;
            }
        }
        return dp;
    }

    /**
     * 第二种方法，
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumNo2(int[] nums, int target){
        int[] dp = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                dp[0] = map.get(complement);
                dp[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return dp;
    }
}
