class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:nums){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->{
            if(map.get(a)==map.get(b)){
                return b-a;
            }
            return map.get(a)-map.get(b);
        });
        for(int key:map.keySet()){
            q.add(key);
        }
        
        int count=0;
        int[] res=new int[nums.length];
        while(!q.isEmpty()){
            int a=q.poll();
            int b=map.get(a);
            while(b-->0){
            res[count++]=a;
        }    
        }
        return res;
            
        
    }
}