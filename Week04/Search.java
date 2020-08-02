
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

    public int searchNo2(int[] nums, int target){
        int len = nums.length;
        int left = 0, right = len-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < nums[right]){
                if(nums[mid] < target && target <= nums[right])
                    left = mid+1;
                else
                    right = mid-1;
            }
            else{
                if(nums[left] <= target && target < nums[mid])
                    right = mid-1;
                else
                    left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
