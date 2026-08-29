class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        // 1,2,3,4...n and calculate (n-1)!
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            if (i < n) fact *= i; // fact = (n-1)!
        }

        k = k - 1; // convert to 0-based indexing
        StringBuilder sb = new StringBuilder();

        for (int i = n; i > 0; i--) {
            int index = k / fact; // which number to pick
            sb.append(numbers.get(index));
            numbers.remove(index);

            if (i > 1) {
                k = k % fact;
                fact = fact / (i - 1);
            }
        }

        return sb.toString();
    }
}