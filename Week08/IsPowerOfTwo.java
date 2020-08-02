/**
 * @author:huangzhen
 * @createTime:2020/8/2 23:07
 * @description:2的幂
 */
public class IsPowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        long x = n;
        return (x & (-x)) == x;
    }

}
