class Solution {
    public boolean isUgly(int n) {

        // Positive number required
        if (n <= 0) {
            return false;
        }

        // Successfully removed all factors
        if (n == 1) {
            return true;
        }

        // Remove factor 2
        if (n % 2 == 0) {
            return isUgly(n / 2);
        }

        // Remove factor 3
        if (n % 3 == 0) {
            return isUgly(n / 3);
        }

        // Remove factor 5
        if (n % 5 == 0) {
            return isUgly(n / 5);
        }

        // Has some other prime factor
        return false;
    }
}