class KthLargest {
    PriorityQueue<Integer> heap;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>(); // min-heap by default
        for (int num : nums) {
            heap.offer(num);
            if (heap.size() > k) {
                heap.poll(); // remove smallest to keep only k largest
            }
        }
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) {
            heap.poll();
        }
        return heap.peek(); // kth largest element
    }
}
