class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int max=0;
        Set<Character> se=new HashSet<>();
        while(right<s.length()){
            char c=s.charAt(right);
            if(se.add(c)){
                
                max=Math.max(max,right-left+1);
                right++;
                
            }
            else{
                while(c!=s.charAt(left)){
                    se.remove(s.charAt(left));
                    left++;
                }
                 se.remove(c);
                left++;
                
            }
            
        }
        return max;
        
    }
}