import java.util.HashMap;

/**
 * @author:huangzhen
 * @createTime:2020/8/7 14:43
 * @description: 转化为小写字母
 */
public class ToLowerCase {

    public String toLowerCase(String str) {
        str.toLowerCase();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] |= 32;
        }
        return String.valueOf(chars);
    }

    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Character> bs = new HashMap();
        int count = 0;
        int r = 0;
        while (r < S.length()) {
            int l = 0;
            while (l < J.length()) {
                if (J.charAt(r) == S.charAt(l)) {
                    count++;
                    l++;
                }
            }
            r++;
        }
        return count;
    }
}
