class Solution {
    public int myAtoi(String s) {
        if(s.equals("")) return 0;
        int n = s.length();
        int res =0, i=0, neg = 1;

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        if(i<n && (s.charAt(i)=='+'|| s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                neg = -1;
                
            }
            i++;
        }
           
          while(i<n && (s.charAt(i)>='0' && s.charAt(i)<='9')){

              if(res>Integer.MAX_VALUE/10 ||  (res==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7) ){
                  if(neg == -1) return Integer.MIN_VALUE;
                 
                else return Integer.MAX_VALUE;           
              }       
                res = res*10 + (s.charAt(i)-'0');
                i++;
          } 


    return neg*res;

    }
}