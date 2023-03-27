class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int k:stones){
            q.add(k);
        }
        while(q.size()>2){
            int a=q.poll();
            int b=q.poll();
            if(a==b){
             continue;
            }
            else{
                q.add(a-b);
            }
            
        }
        if(q.size()==2){
            int a=q.poll();
            int b=q.poll();
            if(a==b){
               return 0; 
            }
            else{
                return a-b;
            }
        }
         return q.poll();
        
    }
}