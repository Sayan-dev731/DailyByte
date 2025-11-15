// Problem: Removing Duplicates
// Date: 11-10-2025
// Author: Gopal Kovachi
// GitHub: gopal0410
// ERP ID: 6605901

// Approach:
// I used hashmap to keep track of elements that has already appeared atleast once and added the elements that haven't appeared a single time to an arraylist.
// I used arraylist helped me keep the size of the array as required and make it simple.
// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.*;

public class gopal0410_6605901 {

    public int[] removeDuplicates(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>(); //Declares a HashMap
        ArrayList<Integer> tempResult = new ArrayList<>(); //Declares an ArrayList for dynamically keeping the size.
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) { //Checks if the element already occured once and is present in the HashMap
                continue; //Skips the remaining part in case of true.
            }
            tempResult.add(nums[i]); //If the element has occured only once then it is added to the ArrayList
            hashMap.put(nums[i], 1); //After the element has been added to the ArrayList, we also add it to the HashMap so that we don't repeat the same element.
        }
        int[] result = new int[tempResult.size()]; //Creates a new int[] array of size that is equal to the ArrayList.
        for (int i = 0; i < tempResult.size(); i++) {
            result[i] = tempResult.get(i); //Adds the elements of ArrayList to the int[] array.
        }
        return result;
    }

    public static void main(String[] args) {
        gopal0410_6605901 solution = new gopal0410_6605901();
        int[] nums = {3, 1, 2, 1, 3, 4, 2};
        System.out.println(Arrays.toString(solution.removeDuplicates(nums)));
    }
}
