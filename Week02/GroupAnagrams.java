import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author huangzhen
 * @date 2020/6/21 12:34
 * 字母异位词分组
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0){
            return new ArrayList();
        }
        HashMap<String, List> map = new HashMap<>();
        int[] ints = new int[26];
        for (String s : strs) {
            Arrays.fill(ints,0);
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                ints[chars[i] - 'a']++;
            }
            StringBuffer key = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                key.append("#").append(ints[i]);
            }
            if (!map.containsKey(key.toString())){
                map.put(key.toString(),new ArrayList());
            }
            map.get(key.toString()).add(s);
        }
        return new ArrayList(map.values());
    }

}
