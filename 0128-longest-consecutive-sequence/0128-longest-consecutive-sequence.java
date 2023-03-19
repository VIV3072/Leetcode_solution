// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashMap<Integer,Boolean> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i]-1)){
//                 map.put(nums[i],false);
//             }
//             else{
//                 map.put(nums[i],true);
//              }
//             if(map.containsKey(nums[i]+1)){
//                 map.put(nums[i]+1,false);
//             }
        
//     }
//         int ans=0;
//         for(int key:map.keySet()){
//             // int count=0;
//             if(map.containsKey(key)==true){
//                 int count=0;
//                 while(map.containsKey(key)){
//                     count++;
//                     key++;
                    
//                 }
//                 ans=Math.max(count,ans);
//             }
//             // ans=Math.max(count,ans);
//         }
//         return ans;
// }
// }
class Solution {
public int longestConsecutive(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			} else {
				map.put(arr[i], true);
			}

			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1, false);
			}

		}

		int ans = 0;
		for (int key : map.keySet()) {

			if (map.get(key) == true) {
				int count = 0;
				while (map.containsKey(key)) {
					count++;
					key++;
				}

				ans = Math.max(ans, count);

			}

		}
		return ans;

	}
}