class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1] * n

        # prefix pass — left to right
        prefix = 1
        for i in range(n):
            result[i] = prefix
            prefix *= nums[i]

        # suffix pass — right to left
        suffix = 1
        for i in range(n - 1, -1, -1):
            result[i] *= suffix
            suffix *= nums[i]

        return result