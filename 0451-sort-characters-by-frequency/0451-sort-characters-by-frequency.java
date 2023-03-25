class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>(); 
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char key:map.keySet()){
            q.add(key);
        }
        StringBuilder sb=new StringBuilder();
      while(!q.isEmpty()){
          char c=q.poll();
          int k=map.get(c);
          while(k-->0){
              sb.append(c);
          }
      }
        return sb.toString();
            
        
    }
}