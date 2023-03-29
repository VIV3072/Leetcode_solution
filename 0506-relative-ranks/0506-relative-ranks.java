// class Solution {
//     public String[] findRelativeRanks(int[] score) {
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int i=0;i<score.length;i++){
//             map.put(score[i],i);
//         }
//         PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0;i<score.length;i++){
//             q.add(score[i]);
//         }
//         String[] arr=new String[score.length];
//         int count=1;
//         while(!q.isEmpty()){
//             int a=q.poll();
//             if(count==1){
//                 arr[map.get(a)]="Gold Medal";
                
                
//             }
//              else if(count==2){
//                 arr[map.get(a)]="Silver Medal";
                
                
//             }
//               else if(count==3){
//                 arr[map.get(a)]="Bronze Medal";
                
                
//             }
//             else{
//             String s=String.valueOf(count); 
//             arr[map.get(a)]=s;
//             }
//             count++;
//         }
//         return arr;
        
//     }
// }
class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int n = score.length;
        String[] res = new String[n];
        
        PriorityQueue<Integer> pq = 
            new PriorityQueue<>((a,b)->score[b]-score[a]);
        
        for(int i=0;i<n;i++){
            pq.add(i);
        }
        int i=1;
        while(!pq.isEmpty()){
            
            int idx = pq.poll();
            
            if(i>3){
                res[idx] = Integer.toString(i);
            }else if(i==1){
                res[idx] = "Gold Medal";
            }else if(i==2){
                res[idx] = "Silver Medal";
            }else if(i==3){
                res[idx] = "Bronze Medal";
            }
            i++;
        }
        
        return res;
        
    }
}