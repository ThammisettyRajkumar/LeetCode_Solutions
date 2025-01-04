class Solution {
    public int waysToSplitArray(int[] nums) {
        
        long[] prefix= new long[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = nums[i]+prefix[i-1];
           
        }
        int result = 0;
        for(int i=0; i<nums.length-1; i++){
            if(prefix[i] >= prefix[nums.length-1] - prefix[i]) result++;
        }
      
        return result;
     }



}

 //10  4 -8 7 

//  10 14 6 13