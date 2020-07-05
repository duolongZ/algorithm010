/**
 * @description: 买卖股票的最佳时机 II
 * @author:huangzhen
 * @createTime:2020/7/4 19:41
 */
public class MaxProfit {


    /**
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                sum += prices[i + 1] - prices[i];
            }
        }
        return sum;
    }

    public int maxProfitNo2(int[] prices) {
        int i = 0, sum = 0, top, trough;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            trough = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            top = prices[i];
            sum += top - trough;
        }

        return sum;
    }

    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();
        int i = solution.maxProfitNo2(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(i);
    }
}
