class Solution {
    public int subarraySum(int[] nums) {
        
        int[] prefixsum = new int[nums.length];
        prefixsum[0]= nums[0];
        for(int i=1; i<nums.length; i++){
            //System.out.print(prefixsum[i-1]+" "+prefixsum[i] + " ");
             prefixsum[i] = prefixsum[i-1] + nums[i];
             System.out.print(prefixsum[i]+ " ");
        }
  
        int sum = 0;
        for(int i=0; i<nums.length; i++){

            int j= Math.max(0, i-nums[i]);
            System.out.println(j);
            if(j==0){
                sum+=prefixsum[i];
            }
            else
            sum+=prefixsum[i] - prefixsum[j-1];

        }
        return sum;
    }
}