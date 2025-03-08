class Solution {
    public int subarraySum(int[] nums, int s) {
        
        int count=0;
        int[] p = new int[nums.length];
        p[0]= nums[0];
        
        for(int i=1; i<nums.length; i++){
            

           p[i] = p[i-1]+nums[i];
        }

        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(i==0){
                    if(p[j] == s) 
                    count++;
                } 
                else if(p[j] -p[i-1] ==s) count++;
            }
        }
        return count;
    }
}