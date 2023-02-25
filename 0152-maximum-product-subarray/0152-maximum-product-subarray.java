// class Solution {
//     public int maxProduct(int[] nums) {
//         int max=nums[0];
//         int min=nums[0];
//         int res=nums[0];
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]<0){
//                 int temp=max;
//                 max=min;
//                 min=temp;
                
//             }
//             max=Math.max(nums[i],nums[i]*max);
//             min=Math.min(min,nums[i]*min);
//             res=Math.max(max,res);
            
//         }
//         return res;
        
//     }
// }
class Solution {
    public int maxProduct(int[] nums) {
            if (nums == null || nums.length == 0) {
        return 0;
    }
    
    int maxProduct = nums[0];
    int minProduct = nums[0];
    int result = maxProduct;
    
    for (int i = 1; i < nums.length; i++) {
        int num = nums[i];
        
        if (num < 0) {
            // Swap maxProduct and minProduct
            int temp = maxProduct;
            maxProduct = minProduct;
            minProduct = temp;
        }
        
        // Update max and min products
        maxProduct = Math.max(maxProduct * num, num);
        minProduct = Math.min(minProduct * num, num);
        
        // Update result
        result = Math.max(result, maxProduct);
    }
    
    return result;
    }
}