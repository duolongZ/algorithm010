/**
 * @author:huangzhen
 * @createTime:2020/8/7 23:11
 * @description: 最后一个单词长度
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int len = 0;
        for(int i = s.length() - 1; i >=0; i-- ){
            if(s.charAt(i) == 32 && len != 0){
                break;
            }else if(s.charAt(i) != 32){
                len++;
            }
        }
        return len;
    }
}
