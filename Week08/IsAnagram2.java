/**
 * @author:huangzhen
 * @createTime:2020/8/2 23:39
 * @description:有效的字母异位词
 */
public class IsAnagram2 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i] != 0){
                return false;
            }
        }
        return true;
    }
}
