class Solution {
    public int maximumSum(int[] nums) {
        int ans=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int k:nums){
            int tem=k;
            int sum=0;
            while(tem>0){
                sum=sum+tem%10;
                tem=tem/10;
                
            }
            if(map.containsKey(sum)){
                ans=Math.max(ans,map.get(sum)+k);
                 if(k>map.get(sum))
                map.put(sum,k);
            }
            else{
                map.put(sum,k);
            }
        }
        return ans;
    
        

    }
}