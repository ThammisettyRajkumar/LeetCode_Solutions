class Solution {
    public int pivotIndex(int[] nums) {
        int[] p = new int[nums.length];
        int[] r = new int[nums.length];

        p[0] = nums[0];
        r[nums.length-1] = nums[nums.length-1];

        for(int i=1; i<nums.length; i++){
            p[i]=p[i-1]+nums[i];
            r[nums.length-1-i] = nums[nums.length-1-i]+r[nums.length-i];
        }
     //   for(int i=nums.length-2; i>=0; i--) r[i] = r[i+1]+nums[i];

        for(int i=0; i<nums.length; i++){
            if(p[i] == r[i])
            return i;
        }
        return -1;
    }
}