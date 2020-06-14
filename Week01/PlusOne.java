/**
 * @author huangzhen
 * @date 2020/6/14 16:31
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] ints = {9, 9};
        PlusOne plusOne = new PlusOne();
        int[] ints1 = plusOne.plusOne(ints);
        for (int anInt : ints1) {
            System.out.println(anInt);
        }
    }
}
