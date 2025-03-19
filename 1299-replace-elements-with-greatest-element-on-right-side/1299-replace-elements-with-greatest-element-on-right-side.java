class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        int prev = -1;
        for(int i=n-1; i>=0; i--){
            max=Math.max(arr[i], max);
            if(max == arr[i]){
                arr[i] = prev;
            }
            else{
                arr[i] = max;
            }
            prev=max;
            System.out.print(arr[i] + ' ');
        }

        return arr;
    }
}