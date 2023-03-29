class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int key:nums){
            if(key==0){
                continue;
            }
            else{
                set.add(key);
            }
        }
        return set.size();
        
    }
}