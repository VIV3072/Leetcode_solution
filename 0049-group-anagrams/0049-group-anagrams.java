class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,List<String>> map=new HashMap<>();
        for(String s: strs){
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int i=0;i<s.length();i++){
                 mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            }
             if(!map.containsKey(mp))
                 map.put(mp,new ArrayList<>());
            map.get(mp).add(s);
             
        }
         return new ArrayList<>(map.values());
        
    }
}