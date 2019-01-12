class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashTable = {}
        for num_index, value in enumerate(nums):
            if target - value in hashTable:
                return [hashTable[target-value], num_index]
            hashTable[value] = num_index
        return None

nums = [2,7,11,15]
target = 28

solution = Solution()
print(solution.twoSum(nums, target))