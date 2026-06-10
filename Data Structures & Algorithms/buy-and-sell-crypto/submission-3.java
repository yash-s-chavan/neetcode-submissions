class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int profit = 0;
        while(j<prices.length){
            if(prices[j]-prices[i]<0){
                i++;
                j++;
            }
            else{
                profit = Math.max(prices[j]-prices[i], profit);
                j++;
            }
        }
        j--;
        while(i<prices.length){
            profit = Math.max(prices[j]-prices[i], profit);
            i++;
        }
        return profit;
    }
}
