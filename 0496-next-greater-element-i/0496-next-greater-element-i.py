class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack = []
        index = {}
        n= len(nums2)
       
        for i in range(n - 1, -1, -1):
            
          
            n = nums2[i]
            index[n] = i
            while stack and n > stack[-1]:
                stack.remove(stack[-1])
            if stack:
                nums2[i] = stack[-1]
            else:
                nums2[i]=-1
            stack.append(n)
           
        
        print(nums2)
        for i in range(0, len(nums1)):
            nums1[i] = nums2[index[nums1[i]]]

        return nums1
           
       
        
