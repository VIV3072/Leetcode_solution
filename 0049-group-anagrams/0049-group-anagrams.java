class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String key=genratekey(strs[i]);
            
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        List<List<String>> ans=new ArrayList<>();
        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
        
        
        
    }
    public static String genratekey(String s){
        int[] fre=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            fre[ch-'a']=fre[ch-'a']+1;
            
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<fre.length;i++){
            sb.append(fre[i]+" ");
        }
        return sb.toString();
        
    }
}