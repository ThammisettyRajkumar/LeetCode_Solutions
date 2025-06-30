class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] suffix_Max = new int[n];
        Arrays.fill(suffix_Max,-1);
        suffix_Max[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            suffix_Max[i] = Math.max( height[i],suffix_Max[i+1]);
        }
        int total = 0;
        int max = height[0];
        for(int i=0; i<n; i++){
            max = Math.max(max,height[i]);

            total+=Math.min(max,suffix_Max[i]) - height[i];
        }

        return total;
    }
}