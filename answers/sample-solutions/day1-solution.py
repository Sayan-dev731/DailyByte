"""
Day 1: Two Sum - Sample Solution
Author: Sample Solution
Date: 2025-11-02

Problem: Given an array of integers and a target, find two numbers that add up to the target.

Approach: Hash Map (Optimal Solution)
- Use a hash map to store numbers we've seen and their indices
- For each number, check if (target - number) exists in the hash map
- If found, return the indices; otherwise, add current number to hash map

Time Complexity: O(n) - We traverse the array once
Space Complexity: O(n) - Hash map stores at most n elements
"""

def two_sum(nums, target):
    """
    Find two numbers in the array that add up to target.
    
    Args:
        nums: List of integers
        target: Target sum
        
    Returns:
        List containing indices of the two numbers
    """
    # Dictionary to store number -> index mapping
    num_map = {}
    
    # Iterate through the array
    for i, num in enumerate(nums):
        # Calculate the complement (number needed to reach target)
        complement = target - num
        
        # Check if complement exists in our map
        if complement in num_map:
            # Found the pair! Return their indices
            return [num_map[complement], i]
        
        # Store current number and its index for future lookups
        num_map[num] = i
    
    # No solution found (though problem guarantees one exists)
    return []


# Test cases
if __name__ == "__main__":
    # Test case 1
    nums1 = [2, 7, 11, 15]
    target1 = 9
    result1 = two_sum(nums1, target1)
    print(f"Test 1: nums = {nums1}, target = {target1}")
    print(f"Output: {result1}")
    print(f"Expected: [0, 1]")
    print(f"Pass: {result1 == [0, 1]}\n")
    
    # Test case 2
    nums2 = [3, 2, 4]
    target2 = 6
    result2 = two_sum(nums2, target2)
    print(f"Test 2: nums = {nums2}, target = {target2}")
    print(f"Output: {result2}")
    print(f"Expected: [1, 2]")
    print(f"Pass: {result2 == [1, 2]}\n")
    
    # Test case 3
    nums3 = [3, 3]
    target3 = 6
    result3 = two_sum(nums3, target3)
    print(f"Test 3: nums = {nums3}, target = {target3}")
    print(f"Output: {result3}")
    print(f"Expected: [0, 1]")
    print(f"Pass: {result3 == [0, 1]}\n")
