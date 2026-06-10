class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i: stones){
            heap.add(i);
        }
        while(heap.size()>1){
            int one = heap.poll();
            int two = heap.poll();
            if(one != two){
                heap.add(one-two);
            }

        }
        if(heap.size() == 0){
            return 0;
        }
        return heap.peek();
    }
}
