class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            q.add(score[i]);
        }
        String[] arr=new String[score.length];
        int count=1;
        while(!q.isEmpty()){
            int a=q.poll();
            if(count==1){
                arr[map.get(a)]="Gold Medal";
                
                
            }
             else if(count==2){
                arr[map.get(a)]="Silver Medal";
                
                
            }
              else if(count==3){
                arr[map.get(a)]="Bronze Medal";
                
                
            }
            else{
            String s=String.valueOf(count); 
            arr[map.get(a)]=s;
            }
            count++;
        }
        return arr;
        
    }
}