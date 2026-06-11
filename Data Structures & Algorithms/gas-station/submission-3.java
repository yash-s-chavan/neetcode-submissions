class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        for(int i = 0;i<gas.length;i++){
            total+=gas[i];
            total-=cost[i];
        }
        if(total<0){
            return -1;
        }
        total = 0;
        int index = 0;
        for(int i = 0;i<gas.length;i++){
            total = total+gas[i]-cost[i];
            if(total<0){
                index = i+1;
                total = 0;
            }
        }
        return index;
    }
}
