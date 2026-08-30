class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        if (digitSum(n) <= target) return 0;
        
        long base = 1;
        long add = 0;
        
        while (digitSum(n + add) > target) {
            base *= 10;
            add = base - (n % base);
        }
        
        return add;
    }
    
    private int digitSum(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
