import java.util.HashMap;

/**
 * @author:huangzhen
 * @createTime:2020/8/7 23:28
 * @description:宝石与石头
 */
public class NumJewelsInStones {

    /**
     * 双指针法
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
         int count = 0;
         int r = 0;
         while (r < S.length()) {
             int l = 0;
             while (l < J.length()) {
                 if (J.charAt(l) == S.charAt(r)) {
                     count++;
                 }
                 l++;
             }
             r++;
         }
         return count;
    }

    /**
     * 哈希表
     * @return
     */
    public int numJewelsInStones1(String J, String S) {
        HashMap<Character, Character> bs = new HashMap<>();
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            bs.put(J.charAt(i),J.charAt(i));
        }
        for (int j = 0; j < S.length(); j++) {
            if (bs.containsKey(S.charAt(j))){
                count++;
            }
        }
        return count;
    }

    /**
     * 正则
     * @return
     */
    public int numJewelsInStones2(String J, String S) {
        String a = "[^"+J+']';
        S = S.replaceAll(a, "");
        return S.length();
    }
}
