import java.util.Arrays;

/**
 * @author huangzhen
 * @date 2020/6/14 16:22
 */
public class Merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
