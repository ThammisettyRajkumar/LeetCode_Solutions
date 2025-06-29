class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums2.length];

        Stack<Integer> mono = new Stack<>();
        HashMap<Integer,Integer> index = new HashMap<>();
        for(int i=nums2.length-1; i>=0; i--){
            int n = nums2[i];
            index.put(n,i);
                while(!mono.isEmpty() &&n > mono.peek()){
                    mono.pop();
                }
                if(!mono.isEmpty()){
                    ans[i] = mono.peek();
                }
                else{
                    ans[i] = -1;
                }
                mono.push(n);
            
        }
        for(int x : ans) System.out.print(x + " ");

        for(int i=0; i<nums1.length; i++){
            nums1[i] = ans[index.get(nums1[i])];
        }
        return nums1;
    }
}