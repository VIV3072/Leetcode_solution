class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res=new ArrayList<>();
        HashMap<String ,Integer> map=new HashMap<>();
        for(String kk:words){
            map.put(kk,map.getOrDefault(kk,0)+1);
        }
        PriorityQueue<String>q=new PriorityQueue<>((a,b)->{
              if(map.get(a)==map.get(b)){
                return a.compareTo(b); // to deal with lexicographically sorted string
            }
            //Store is descending order of their frequency
            return map.get(b)-map.get(a);
            
        });
        for(String key:map.keySet()){
            q.add(key);
        }
        while(k-->0){
            String s=q.poll();
            res.add(s);
        }
        return res;
        
    }
}