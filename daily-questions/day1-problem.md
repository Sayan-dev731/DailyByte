# Day 1: Two Sum

## Difficulty: Easy

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers that add up to the target.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

## Examples

### Example 1:
```
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

### Example 2:
```
Input: nums = [3, 2, 4], target = 6
Output: [1, 2]
Explanation: Because nums[1] + nums[2] == 6, we return [1, 2].
```

### Example 3:
```
Input: nums = [3, 3], target = 6
Output: [0, 1]
Explanation: Because nums[0] + nums[1] == 6, we return [0, 1].
```

## Constraints

- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists.

## Follow-up

Can you come up with an algorithm that has better than O(n²) time complexity?

## Hints

<details>
<summary>Hint 1</summary>
Think about what information you need to store as you iterate through the array.
</details>

<details>
<summary>Hint 2</summary>
A hash map/dictionary can help you achieve O(n) time complexity by storing previously seen numbers.
</details>

<details>
<summary>Hint 3</summary>
For each number, check if (target - current number) exists in your hash map.
</details>

## Submission Guidelines

1. Create your solution file in `answers/your-name/day1-solution.<ext>`
2. Include comments explaining your approach
3. Test your solution with all provided examples
4. Analyze the time and space complexity
5. Submit via Pull Request following the guidelines in README.md

## Deadline

**Submit by:** [24 hours from problem release]

---

Good luck and happy coding! 🚀
