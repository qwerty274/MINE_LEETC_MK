class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int val = 1;
        for (int i = 0; i < n / 2; i++) {
            res[i] = val;
            res[i + n / 2] = -val;
            val++;
        }
        if (n % 2 == 1) res[n - 1] = 0;
        return res;
    }
}
