public class BestTimeToBuySellStock {
  
    
//  For leetcode program will start from here

    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            int profit = prices[i] - buyPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }


//  Till here




    public static void main(String[] args) {
        BestTimeToBuySellStock obj = new BestTimeToBuySellStock();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println("Array 1 Profit: " + obj.maxProfit(prices1));
        System.out.println("Array 2 Profit: " + obj.maxProfit(prices2));
    }
}
