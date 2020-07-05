
/**
 * @author:huangzhen
 * @createTime:2020/7/5 23:50
 * @description: 搜索旋转排序数组
 */
public class Search {


    /**
     * 这道题的最简易写法，没有看懂 异或 符的用法，希望老师下周能够讲解一下子 谢谢啦！
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[0] > target ^ nums[0] > nums[mid] ^ target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left == right && nums[left] == target ? left : -1;
    }

    public static void main(String[] args) {
        Search search = new Search();
        int search1 = search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        System.out.println(search1);
        System.out.println("==================");
        System.out.println(true ^ false);
        System.out.println(true ^ true ^ true);
        System.out.println(false ^ false);
    }
}
