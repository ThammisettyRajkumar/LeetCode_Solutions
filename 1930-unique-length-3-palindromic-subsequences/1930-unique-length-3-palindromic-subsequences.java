class Solution {
    public int countPalindromicSubsequence(String s) {
         int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i) -'a';
            if(first[c] == -1) first[c] = i;
             last[c] = i;
        }
        int ans = 0;
        for(int j=0; j<26; j++){
            if(first[j] == -1) continue;
            HashSet<Character> set = new HashSet();
            for(int k=first[j]+1; k< last[j]; k++){
                set.add(s.charAt(k));
            }
            ans+=set.size();
        }
        return ans;
    }
}