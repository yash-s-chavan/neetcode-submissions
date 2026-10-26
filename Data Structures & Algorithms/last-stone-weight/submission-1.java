class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<stones.length;i++){
            queue.add(stones[i]);
        }
        while(queue.size()>1){
            int stoneOne = queue.poll();
            int stoneTwo = queue.poll();
            if(stoneOne < stoneTwo){
                queue.add(stoneTwo-stoneOne);
            }
            else if(stoneOne > stoneTwo){
                queue.add(stoneOne-stoneTwo);
            }

        }
        if(queue.isEmpty()){
            return 0;
        }
        return queue.poll();

    }
}
