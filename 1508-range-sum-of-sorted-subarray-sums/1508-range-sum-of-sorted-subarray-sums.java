class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        ArrayList<Integer> sub = new ArrayList<>();

        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=i; j<n; j++){
                sum+=nums[j];
                sub.add(sum);
            }
        }

        Collections.sort(sub);
        int mod =(int) 1e9+7;
        int rangeSum =0;
        for(int i=left-1; i<right; i++){
            rangeSum= (rangeSum + sub.get(i))%mod;
        }

        return rangeSum;
    }
}