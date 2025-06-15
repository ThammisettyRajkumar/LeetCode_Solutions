class Solution {
    public void reverseString(char[] s) {
        Stack<Character> ds = new Stack<>();

        for(int i=0; i<s.length; i++){
            ds.push(s[i]);
        }
        int i=0;
        while(!ds.isEmpty()){
            
            s[i] =ds.pop();
            
            i+=1;
        }
        return;
    }
}