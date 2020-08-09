/**
 * @author:huangzhen
 * @createTime:2020/8/8 14:42
 * @description:反转字符串II
 */
public class ReverseStr {

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int j = i, m = Math.min(i + k - 1, s.length() - 1);
            while (j < m) {
                char temp = chars[j];
                chars[j] = chars[k];
                chars[k] = temp;
            }
        }
        return new String(chars);
    }

}
