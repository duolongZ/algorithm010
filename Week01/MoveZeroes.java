import jdk.nashorn.api.scripting.JSObject;

/**
 * @author huangzhen
 * @date 2020/6/13 15:22
 */
public class MoveZeroes {

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     *      示例:
     *
     *      输入: [0,1,0,3,12]
     *     输出: [1,3,12,0,0]
     *
     *      说明:
     *
     *
     *      必须在原数组上操作，不能拷贝额外的数组。
     *      尽量减少操作次数。
     *
     *      Related Topics 数组 双指针
     *      第一种方法：不额外使用数组，参考官网答案给出的结果
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                if(i != j){
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    /**
     * 第二种方法
     * @param nums
     */
    public void moveZeroesNo2(int[] nums) {
        int j = 0;
        int k = 0;
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                ints[j] = nums[i];
                j++;
            }else {
                k++;
            }
        }
        for (int m = 0; m < k; m++) {
            ints[ints.length-m-1] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ints[i];
        }
    }

    public static void main(String[] args) {
        int[] ints = {1, 0, 2, 5, 4, 8, 0, 3};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(ints);
        System.out.println(ints);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
//        moveZeroes.moveZeroesNo2(ints);
//        for (int anInt : ints) {
//            System.out.print(anInt+" ");
//        }

    }
}
