class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;   // Tracks the global maximum
        int currCount = 0;  // Tracks the current consecutive streak
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                currCount++;          // Extend current streak
                maxCount = Math.max(maxCount, currCount); // Update max if needed
            } else {
                currCount = 0;        // Reset streak on encountering 0
            }
        }
        
        return maxCount;
    }
}