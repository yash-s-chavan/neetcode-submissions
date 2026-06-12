class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] bucket = (ArrayList<Integer>[]) new ArrayList[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }
        int currentNum = nums[0];
        int index = 1;
        for(int i = 1;i<nums.length;i++){
            if(currentNum == nums[i]){
                index++;
            }
            else{
                bucket[index-1].add(currentNum);
                index = 1;
                currentNum = nums[i];
            }
        }
        System.out.println(Arrays.toString(bucket));
        bucket[index-1].add(currentNum);

        int[] answer = new int[k];
        index = k-1;
        System.out.println(Arrays.toString(bucket));
        for(int i = bucket.length-1;i>=0;i--){
            for(int j: bucket[i]){
                if(index == -1){
                    return answer;
                }
                answer[index] = j;
                index--;
            }
        }
        return answer;
    }
}
