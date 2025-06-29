class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        stack = []
        
        n = len(nums)
        nge = n*[0]
        for i in range(2*len(nums)-1, -1, -1):
            print(i)
            while stack and stack[-1] <= nums[i%n]:
                stack.remove(stack[-1])
            if i< n:
                if stack : 
                    nge[i] = stack[-1]
                else : 
                    nge[i] = -1
            stack.append(nums[i%n])
            # print(f"the stack at ",stack)
        return nge