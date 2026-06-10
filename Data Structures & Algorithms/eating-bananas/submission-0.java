class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = piles[0];
        for(int i = 1;i<piles.length;i++){
            if(piles[i]>high){
                high = piles[i];
            }
        }
        int mid = 0;
        while(low<high){
            mid = (low+high)/2;
            System.out.println(mid);
            int test = 0;
            for(int i = 0;i<piles.length;i++){
                test+=Math.ceil(piles[i]*1.0/mid);
                
            }
            
            if(h>=test){
                high = mid;
            }
            else{
                low = mid+1;
            }
            

        }
        return (low+high)/2;
    }
}
