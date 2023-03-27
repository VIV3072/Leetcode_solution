class Solution {
    public int maxProduct(int[] nums) {
        // PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
        // for(int k:nums){
        //     q.add(k);
        // }
        // int a=q.poll()-1;
        // int b=q.poll()-1;
        // return a*b;
        Arrays.sort(nums);
        int a=nums[nums.length-1]-1;
        int b=nums[nums.length-2]-1;
        return a*b;
        
        
    }
}