class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mappings = {')' : '(', ']' : '[', '}' : '{'}
        for c in s:
            if c in mappings.values():
                stack.append(c)
            elif c in mappings.keys():
                if not stack or stack.pop() != mappings[c]:
                    return False
        
        return not stack
        