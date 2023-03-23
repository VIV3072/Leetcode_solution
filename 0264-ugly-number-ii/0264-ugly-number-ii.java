class Solution {
    public int nthUglyNumber(int n) {
        if(n==1){
            return 1;
        }
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        int p2=0,p3=0,p5=0;
        while(ls.size()<n){
            int v2=ls.get(p2)*2;
            int v3=ls.get(p3)*3;
            int v5=ls.get(p5)*5;
            int min =Math.min(v2,Math.min(v3,v5));
            ls.add(min);
            if(min==v2){
                p2++;
            }
             if(min==v3){
                p3++;
            }
             if(min==v5){
                p5++;
            }
                
        }
        return ls.get(ls.size()-1);
            
        
    }
}