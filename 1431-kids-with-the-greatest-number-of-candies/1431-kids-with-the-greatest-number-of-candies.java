class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls=new ArrayList<>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ls.add(true);
                
            }
            else{
                ls.add(false);
            }
        }
        return ls;
        
        
    }
}