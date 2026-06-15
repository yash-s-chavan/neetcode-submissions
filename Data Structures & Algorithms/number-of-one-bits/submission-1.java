class Solution {
    public int hammingWeight(int n) {
        int mask = 00000000000000000000000000000001;
        int total = 0;
        while(n!=0){
            if((n&mask) == 00000000000000000000000000000001){
                total++;
            }
            n = n>>1;
        }
        return total;
    }
}
