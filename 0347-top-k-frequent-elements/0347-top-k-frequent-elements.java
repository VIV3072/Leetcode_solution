class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer>[] bucket=new List[nums.length+1];
        for(int key:map.keySet()){
            int fre=map.get(key);
            if(bucket[fre]==null){
                bucket[fre]=new ArrayList<>();
            }
            bucket[fre].add(key);
        }
        int[] arr=new int[k];
        int count =0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int j=0;j<bucket[i].size();j++){
                    arr[count++]=bucket[i].get(j);
                    // if(count==k){
                
            
                    
                }
            }
            if(count==k){
                break;
            }
        }
        return arr;
        
     
        
        
    }
}