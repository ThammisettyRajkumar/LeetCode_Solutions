class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int[] ar=new int[2];
        for(int i=0; i<nums.length; i++){
            int a=target-nums[i];
            if(map.containsKey(a))
            {
                ar[0]=map.get(a);
                ar[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ar;
        
    }
}