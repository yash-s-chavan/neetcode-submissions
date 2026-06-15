class Solution {
    public int hammingWeight(int n) {
        int mask = 1;
        int total = 0;
        while(n!=0){
            if((n&mask) == 1){
                total++;
            }
            n = n>>1;
        }
        return total;
    }
}
