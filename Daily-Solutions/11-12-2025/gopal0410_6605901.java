// Problem: Reverse the Array
// Date: 11-12-2025
// Author: Gopal Kovachi
// GitHub: 6605901

// Approach:
// I used the two pointer approach.

// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;

public class gopal04110_6605901 {

    //This function uses the two pointer method.
    public void reversal(int[] nums){
        int left = 0; //Sets the left pointer to 0th position;
        int right = nums.length - 1; //Sets the right pointer to the end of the array.
        while(left <= right){ //Runs till half the array is iterated and left and right are equal.
            //Simple swapping algorithm
            int temp = nums[left]; 
            nums[left] = nums[right];
            nums[right] = temp;
            left++; right--;
        }
    }
    public static void main(String[] args) {
        gopal04110_6605901 solution = new gopal04110_6605901();
        int[] array = {1,2,3,4,5,6,7};
        solution.reversal(array);
        System.out.println(Arrays.toString(array));
    }
}
