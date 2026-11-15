class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
    
    // countEven starts at 1 because the initial prefix sum (0) is even
    long countOdd = 0;
    long countEven = 1;
    
    long currentSum = 0;
    long result = 0;

    for (int num : arr) {
        currentSum += num;

        if (currentSum % 2 != 0) {
            // Current prefix sum is odd.
            // To get an odd subarray sum ending here, we subtract a previous EVEN prefix sum.
            result = (result + countEven) % MOD;
            countOdd++;
        } else {
            // Current prefix sum is even.
            // To get an odd subarray sum ending here, we subtract a previous ODD prefix sum.
            result = (result + countOdd) % MOD;
            countEven++;
        }
    }

    return (int) result;
    }
}