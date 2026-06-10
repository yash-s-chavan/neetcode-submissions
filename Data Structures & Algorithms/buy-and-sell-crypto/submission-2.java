class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        int j = 1;
        if(prices.length == 1){
            return 0;
        }
        while(i<prices.length){
            if(prices[i]>prices[j]){
                i++;
                j++;
            }
            else {
                
                maxProfit = Math.max(prices[j]-prices[i],maxProfit);
                System.out.println(prices[j]-prices[i]);
                j++;
            }
            if(j == prices.length){
                i++;
                j--;
            }
        }
        return maxProfit;
    }
}
