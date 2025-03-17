
class Solution {

    public String sort(String strs){
        
            char[] temp = strs.toCharArray();
            Arrays.sort(temp);
            System.out.println(temp);
            return new String(temp);
        
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> sortedStrings = new ArrayList<>();

        HashMap<String, List<String> > words = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String temp = sort(strs[i]);
            List<String> s = new ArrayList<>();
            if(words.containsKey(temp)){
                 List<String> t = words.get(temp);
                t.add(strs[i]);
                words.put(temp, t );
            }
            else{
                s.add(strs[i]);
            words.put(temp, s );
            }
        }

        for(Map.Entry<String, List<String>> word : words.entrySet()){
            sortedStrings.add(word.getValue());
        }
        return sortedStrings;
    }
}
