class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int l:gifts){
            q.add(l);
        }
        for(int i=0;i<k;i++){
            int a=q.poll();
            double b=Math.floor(Math.sqrt(a));
            int v=(int)b;
            q.add(v);
            
        }
        long an=0;
        while(!q.isEmpty()){
            an=an+q.poll();
            
        }
        return an;
        
    }
}