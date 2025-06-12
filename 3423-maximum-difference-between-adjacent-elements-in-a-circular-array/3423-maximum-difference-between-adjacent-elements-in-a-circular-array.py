class Solution:
    def maxAdjacentDistance(self, nums: List[int]) -> int:
        n = len(nums)
        max = abs(nums[0] - nums[n-1])

        for i in range(1,n):
            if max < abs(nums[i] - nums[i-1]):
                max = abs(nums[i] - nums[i-1])
        
        return max