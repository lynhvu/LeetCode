class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int curPrice : prices) {
            // try to find the posible minimum price
            if (curPrice < minPrice) {
                minPrice = curPrice;
            } 
            // check if the new profit is greater than max
            else if(curPrice - minPrice > maxProfit){
                maxProfit = curPrice - minPrice;
            }
        }
        return maxProfit;
    }
}