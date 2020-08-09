/**
 * @author:huangzhen
 * @createTime:2020/8/8 14:20
 * @description:反转字符串
 */
public class ReverseString {

    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length / 2 && j >= s.length / 2; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
