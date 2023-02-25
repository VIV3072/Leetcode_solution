class Solution {
    public int maxProfit(int[] arr) {
        if(arr.length==1)
            return 0;
        int res=arr[1]-arr[0];
        int minn=arr[0];
        for(int i=1;i<arr.length;i++){
            res=Math.max(res,arr[i]-minn);
            minn=Math.min(minn,arr[i]);
        }
        if(res<0 ||res==0){
            return 0;
        }
        else{
            return res;
        }
   
    }
    
    
    
    
    
}
