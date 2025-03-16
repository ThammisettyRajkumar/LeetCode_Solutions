class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;

        int[] con  = new int[2*n];

        for(int i=0; i<n; i++){
            con[i]  = nums[i];
            con[i+n] = nums[i];
        }

        return con;
    }
}