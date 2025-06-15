class Solution {
public:
    bool isValid(string s) {
          stack<char> openBracket;

        for (int i = 0; i < s.length(); i++)
        {   
            // Store all open brackets to stack so we can pop it out
            // If respective closing bracket is found
            if (s[i] == '(' || s[i] == '{' || s[i] == '[')
            {
                openBracket.push(s[i]);
                continue;
            }

            if (!openBracket.empty())
            {   
				// Searching for valid pairs like () {} []
				// If matched , pop out the opening bracket
                if ((s[i] == ')' and openBracket.top() == '(') 
                || (s[i] == '}' and openBracket.top() == '{') 
                || (s[i] == ']' and openBracket.top() == '['))
                {
                    openBracket.pop();
                }
				// If pair is not matched, return false
                else if ((s[i] == ')' and openBracket.top() != '(') 
                || (s[i] == '}' and openBracket.top() != '{') 
                || (s[i] == ']' and openBracket.top() != '['))
                {
                    return false;
                }
            }
			// If no closing bracket is found
            else if (openBracket.empty() && s.length() > 0)
            {
                return false;
            }
        }
		// All opening bracket are popped out if,
		// Closing bracket is matched.
        if (openBracket.empty())
        {
            return true;
        }
        return false;
    }
};