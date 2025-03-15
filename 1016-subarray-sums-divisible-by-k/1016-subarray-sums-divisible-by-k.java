class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;
        int sum =0;
         map.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int rem = (sum%k +k)%k;

         
            if(map.containsKey(rem)){
               count+=map.get(rem);
            }
             map.put(rem, map.getOrDefault(rem, 0)+1);
           
            
            System.out.println(map);
            
        }
        return count;
    }
}