class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        if(n==0){
            return true;
        }
        int srt=0;
        int end=n-1;
        while(srt<=end){
            if(!Character.isLetterOrDigit(s.charAt(srt))){
                srt++;
            }
           else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            else if(lowercase(s.charAt(srt))!=lowercase(s.charAt(end))){
                return false;
            }
            else{
                end--;
                srt++;
            }
            
            
            
        }
        return true;
            
        
        
    }

    public char lowercase(char c){
        if(('a'<=c&& c<='z')||('0'<=c&&c<='9')){
            return c;
        }
        else{
            return (char)((int)c+32);
        }
    }
}