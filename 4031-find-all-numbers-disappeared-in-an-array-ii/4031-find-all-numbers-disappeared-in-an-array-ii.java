class Solution {
    public List<List<Integer>> findDisappearedNumbers(
            int[] nums, int lower, int upper) {

        List<List<Integer>> ans = new ArrayList<>();

        // Sort the array so we can process numbers in order.
        Arrays.sort(nums);

        // Start checking from the lower boundary.
        int current = lower;

        // Go through every number in nums.
        for (int num : nums) {

            // Ignore numbers outside our required range.
            if (num < lower || num > upper)
                continue;

            // If there is a gap before num,
            // those numbers are missing.
            if (current < num) {
                ans.add(Arrays.asList(current, num - 1));
            }

            // Move current past num.
            current = Math.max(current, num + 1);
        }

        // Check if anything is missing after the last number.
        if (current <= upper) {
            ans.add(Arrays.asList(current, upper));
        }

        return ans;
    }
}