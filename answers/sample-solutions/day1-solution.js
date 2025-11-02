/**
 * Day 1: Two Sum - Sample Solution (JavaScript)
 * Author: Sample Solution
 * Date: 2025-11-02
 * 
 * Problem: Given an array of integers and a target, find two numbers that add up to the target.
 * 
 * Approach: Hash Map (Optimal Solution)
 * - Use a Map to store numbers we've seen and their indices
 * - For each number, check if (target - number) exists in the Map
 * - If found, return the indices; otherwise, add current number to Map
 * 
 * Time Complexity: O(n) - We traverse the array once
 * Space Complexity: O(n) - Map stores at most n elements
 */

/**
 * Find two numbers in the array that add up to target
 * @param {number[]} nums - Array of integers
 * @param {number} target - Target sum
 * @return {number[]} - Indices of the two numbers
 */
function twoSum(nums, target) {
    // Map to store number -> index mapping
    const numMap = new Map();
    
    // Iterate through the array
    for (let i = 0; i < nums.length; i++) {
        const num = nums[i];
        // Calculate the complement (number needed to reach target)
        const complement = target - num;
        
        // Check if complement exists in our map
        if (numMap.has(complement)) {
            // Found the pair! Return their indices
            return [numMap.get(complement), i];
        }
        
        // Store current number and its index for future lookups
        numMap.set(num, i);
    }
    
    // No solution found (though problem guarantees one exists)
    return [];
}

// Test cases
console.log("Running test cases...\n");

// Test case 1
const nums1 = [2, 7, 11, 15];
const target1 = 9;
const result1 = twoSum(nums1, target1);
console.log(`Test 1: nums = [${nums1}], target = ${target1}`);
console.log(`Output: [${result1}]`);
console.log(`Expected: [0, 1]`);
console.log(`Pass: ${JSON.stringify(result1) === JSON.stringify([0, 1])}\n`);

// Test case 2
const nums2 = [3, 2, 4];
const target2 = 6;
const result2 = twoSum(nums2, target2);
console.log(`Test 2: nums = [${nums2}], target = ${target2}`);
console.log(`Output: [${result2}]`);
console.log(`Expected: [1, 2]`);
console.log(`Pass: ${JSON.stringify(result2) === JSON.stringify([1, 2])}\n`);

// Test case 3
const nums3 = [3, 3];
const target3 = 6;
const result3 = twoSum(nums3, target3);
console.log(`Test 3: nums = [${nums3}], target = ${target3}`);
console.log(`Output: [${result3}]`);
console.log(`Expected: [0, 1]`);
console.log(`Pass: ${JSON.stringify(result3) === JSON.stringify([0, 1])}\n`);
