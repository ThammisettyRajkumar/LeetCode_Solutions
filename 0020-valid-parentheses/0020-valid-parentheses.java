class Solution {
    public boolean isValid(String s) {
        Stack<Character>  ds = new Stack<>();
        int n = s.length();
        if(n < 2 ) return false;
        for(int i=0; i<n; i++){
         char c = s.charAt(i);

            if(c == '('|| c== '{' || c== '['){
                ds.push(c);
            }
            else if(c== ')' || c== '}' || c== ']'){
                if(ds.isEmpty())
                 return false;
                 else{
                    char top = ds.peek();
                    if((c== ')' && top!='(') || ( c== '}' && top!='{') || (c== ']' && top!= '[' )  ){
                        return false;
                    }
                    ds.pop();
                 }
            }
        }

        return ds.isEmpty();
    }
}