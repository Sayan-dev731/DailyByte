// Problem: Single Rotation of Array
// Date: 11-11-2025
// Author: Gopal Kovachi
// GitHub: gopal0410
// ERP ID: 6605901

// Approach-1:
// I first created an array in which I stored the last elements which are to be added in front to show the rotation.
// Then, I used a for loop to increment the positions of the elements in the orignal array such that I can replace the elements at the beginning with the required elements.
// Then, I added the elements I stored in an array for showing rotation and returned the original array.
// Time Complexity: O(n)
// Space Complexity: O(n)

// Approach-2:
// I just reversed an array first, then reveresed the first half till k-number of elements. Then, reversed the second half
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
public class gopal04110_6605901 {

    //This function rotates the array by using an additional array which stores the elements to be rotated.
    public int[] rotatedArrayUsingExtraArray(int[] nums, int k) {
        if (k > nums.length) { //Checks if the length of k is greater than the size of the array.
            k = k % nums.length; //Sets k the value which basically causes the array to look like it was supposed to look like before this operation.
        }
        if (k == 0){ //Checks if the rotation required is 0
            return nums; //Returns directly without rotation
        }
        int[] k_elements = new int[k]; //New array for adding the elements at the start
        for (int i = 0; i < k; i++) { 
            k_elements[i] = nums[nums.length - 1 - i]; //Adds elements in the array from back for later adding it in the first.
        }
        for (int i = nums.length - 1; i > k - 1; i--) {
            nums[i] = nums[i - k]; //This iterates the positions of the elements which are just being pushed back as elements will be added to the front.
        }
        for (int i = 0; i < k; i++) {
            nums[i] = k_elements[k_elements.length - 1 - i]; //Adds the elements in the array in the original array's front
        }
        return nums;
    }

    //This function reverses the array in-place to replicate the rotation of the array.
    public int[] rotatedArrayUsingReversal(int[] nums, int k) {
        if (k > nums.length) { //Checks if the length of k is greater than the size of the array.
            k = k % nums.length; //Sets k the value which basically causes the array to look like it was supposed to look like before this operation.
        }
        if (k == 0) { //Checks if the rotation required is 0
            return nums; //Returns directly without rotation
        }
        reversal(nums, 0, nums.length - 1); //Reverses the whole array in-place.
        reversal(nums, k, nums.length - 1); //Reverses elements from kth position to the last element.
        reversal(nums, 0, k - 1); //Reverses the elements from the start to the element before kth position.
        return nums;
    }

    //This function is used to reverse an array from given starting and ending point.
    public void reversal(int[] nums, int start, int end) {
        for (int i = start; i <= (start + end) / 2; i++) { //Runs the loop till the middle element between start's and end's position.
            //Simple swapping algorithm.
            int temp = nums[i];
            nums[i] = nums[start + end - i];
            nums[start + end - i] = temp;
        }
    }

    public static void main(String[] args) {
        gopal04110_6605901 solution = new gopal04110_6605901();
        int[] nums1 = {1, 2};
        int[] nums2 = Arrays.copyOf(nums1, nums1.length);
        System.out.println(Arrays.toString(solution.rotatedArrayUsingReversal(nums1, 3)));
        System.out.println(Arrays.toString(solution.rotatedArrayUsingExtraArray(nums2, 3)));
    }
}
