/**
 * 柠檬水找零
 */
public class LemonadeChange {


    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                ten++;
                if (five > 0) {
                    five--;
                } else {
                    return false;
                }
            } else {
                if (ten > 0 && five > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LemonadeChange solution = new LemonadeChange();
        boolean b = solution.lemonadeChange(new int[]{5, 5, 10, 10, 20});
        System.out.println(b);
    }
}
