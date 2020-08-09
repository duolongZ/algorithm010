/**
 * @author:huangzhen
 * @createTime:2020/8/8 0:18
 * @description:字符串转化为整数
 */
public class MyAtoi {


    /**
     * 暴力法
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        int MAX_INT = Integer.MAX_VALUE;
        int MIN_INT = Integer.MIN_VALUE;
        boolean flag = false;
        boolean j = false;
        String strNew = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 43) {
                if (j){
                    break;
                }else if (flag){
                    break;
                }
                j = true;
            } else if (j == true && str.charAt(i) == 45) {
                break;
            } else if (str.charAt(i) == 32) {
                if (j){
                    break;
                }else if (flag){
                    break;
                }else if (strNew.length() != 0){
                    break;
                }else {
                    continue;
                }
            } else if (str.charAt(i) == 45) {
                if (strNew.length() != 0){
                    break;
                }else if (flag){
                    break;
                }else if (j){
                    break;
                }
                flag = true;
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                strNew += str.charAt(i);
            } else {
                break;
            }
        }
        if (flag && strNew.length() != 0) {
            try {
                return -Integer.valueOf(strNew);
            } catch (Exception e) {
                return MIN_INT;
            }
        } else if (strNew.length() != 0) {
            try {
                return Integer.valueOf(strNew);
            } catch (Exception e) {
                return MAX_INT;
            }
        }
        return 0;
    }

    /**
     * leetcode上面更优解法
     * @param str
     * @return
     */
    public int myAtoi1(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        int idx = 0;
        while (idx < n && chars[idx] == ' ') {
            // 去掉前导空格
            idx++;
        }
        if (idx == n) {
            //去掉前导空格以后到了末尾了
            return 0;
        }
        boolean negative = false;
        if (chars[idx] == '-') {
            //遇到负号
            negative = true;
            idx++;
        } else if (chars[idx] == '+') {
            // 遇到正号
            idx++;
        } else if (!Character.isDigit(chars[idx])) {
            // 其他符号
            return 0;
        }
        int ans = 0;
        while (idx < n && Character.isDigit(chars[idx])) {
            int digit = chars[idx] - '0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                // 本来应该是 ans * 10 + digit > Integer.MAX_VALUE
                // 但是 *10 和 + digit 都有可能越界，所有都移动到右边去就可以了。
                return negative? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            idx++;
        }
        return negative? -ans : ans;
    }

    public static void main(String[] args) {
        MyAtoi myAtoi = new MyAtoi();
        int i = myAtoi.myAtoi("   +0 123");
        System.out.println(i);
        boolean flag = false;
        boolean j = false;
        System.out.println(true^flag & j);
    }
}
