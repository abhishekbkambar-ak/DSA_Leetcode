import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Value -> Index
        Map<Integer, Integer> seen = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement already exists in the map
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            
            // Store the current number and its index in the map
            seen.put(nums[i], i);
        }
        
        // LeetCode guarantees exactly one solution, but a return statement 
        // is required by the Java compiler for edge cases.
        return new int[] {};
    }
}
