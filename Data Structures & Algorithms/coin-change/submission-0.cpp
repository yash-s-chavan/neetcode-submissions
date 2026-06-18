class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        if(amount == 0){
            return 0;
        }
        if(coins.size() == 1){
            if(amount%coins[0] == 0){
                return amount/coins[0];
            }
        }
        std::vector<int> dp(amount+1,10001);
        dp[0] = 0;
        for(int i = 0;i<coins.size();++i){
            for(int j = coins[i];j<dp.size();++j){
                dp[j] = std::min(dp[j], 1+dp[j-coins[i]]);
            }
            for(int i: dp){
                std::cout<<i<<",";
            }
        }
        if(dp[amount] == 10001){
            return -1;
        }
        return dp[amount];
    }
};
