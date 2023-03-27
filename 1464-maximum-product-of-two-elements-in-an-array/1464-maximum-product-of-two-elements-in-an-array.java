class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
        for(int k:nums){
            q.add(k);
        }
        int a=q.poll()-1;
        int b=q.poll()-1;
        return a*b;
        
        
    }
}