class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int lo=0;
        int hi=nums.length-1;
        int i=nums.length-1;
        while(lo<=hi){
            int x=nums[lo]*nums[lo];
            int y=nums[hi]*nums[hi];
            if(x>y){
                res[i]=x;
                lo++;
                
            }
            else{
                res[i]=y;
                hi--;
                
            }
            i--;
        }
        return res;
        
    }
}