import static java.lang.System.*;
/**
 * You have an array for which the i-th element is the price of a given stock on day i.
 * You must sell the stock before you buy again. Find maximum profit.
 * O(N) time, O(1) space.
 */
public class BuyAndSellStock {

    public static int calculateMaxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            //if the stock at next day is smaller than today - you need to sell today
            if (prices[i] < prices[i - 1]) {
                profit += prices[i - 1] - buyPrice;
                buyPrice = prices[i];
            }
        }
        //check the last element
        profit += prices[prices.length - 1] - buyPrice;
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 4, 5, 7, 2};
        out.println(calculateMaxProfit(prices)); //7
    }
}
