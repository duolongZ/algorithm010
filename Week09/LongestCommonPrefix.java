/**
 * @author:huangzhen
 * @createTime:2020/8/8 14:16
 * @description:最长公共前缀
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        for (int i = 0; i < strs.length - 1; i++) {
            length = Math.min(strs[i+1].length(), length);
        }
        int l = 0;
        while (l < length) {
            if (!commonPrefix(strs, l)) {
                break;
            }
            l++;
        }
        return l == 0 ? "" : strs[0].substring(0, l);
    }

    private boolean commonPrefix(String[] strs, int l) {
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i].charAt(l) != strs[i + 1].charAt(l)) {
                return false;
            }
        }
        return true;
    }
}
