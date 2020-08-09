import java.util.HashMap;

/**
 * @author:huangzhen
 * @createTime:2020/8/7 23:32
 * @description:字符串中的第一个唯一字符
 */
public class FirstUniqChar {

    /**
     * 哈希表
     *
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 双指针（会超出时间限制） 时间复杂度(O(n^2))
     *
     * @param s
     * @return
     */
    public int firstUniqChar1(String s) {
        for (int i = 0; i < s.length(); i++) {
            //用tag 标记字母出现的次数
            int tag = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    tag++;
                } else if (j == s.length() - 1 && tag == 0) {
                    return i;
                }

            }
        }
        return -1;
    }

}
