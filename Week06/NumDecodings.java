/**
 * @author:huangzhen
 * @createTime:2020/7/19 1:37
 * @description:解码方法
 */
public class NumDecodings {

    //动态规划加滚动数组
    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') return 0;
        int q = 1, p = 1;
        for (int i = 1; i < s.length(); i++) {
            int tmp = p;
            if (s.charAt(i) == '0'){
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2'){
                    p = q;
                }else {
                    return 0;
                }
            }else if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6')){
                p = p + q;
            }
            q = tmp;
        }
        return p;
    }
}
