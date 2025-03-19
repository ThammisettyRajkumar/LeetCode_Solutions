class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
       for(int i=s.length()-1; i>=0; i--){
         char c = s.charAt(i);
        
        if(l>0 && c ==  ' ' )
        return l;

         if( c!= ' ') l++;
       }
        return l;
    }
}