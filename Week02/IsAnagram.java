/**
 * @author huangzhen
 * @date 2020/6/21 12:12
 * 有效的字母异位词
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] tables = new int[26];
        for (int i = 0; i < s.length(); i++) {
            tables[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tables[t.charAt(i) - 'a']--;
            if (tables[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
