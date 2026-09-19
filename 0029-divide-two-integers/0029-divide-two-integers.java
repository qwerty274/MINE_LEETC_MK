class Solution {
  public int divide(int dividend, int divisor) {
    // Handle overflow case
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
      return Integer.MAX_VALUE;
    }

    // Determine sign
    int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

    long dvd = Math.abs((long) dividend);
    long dvs = Math.abs((long) divisor);
    long ans = 0;

    // Use bit shifting instead of multiplication
    while (dvd >= dvs) {
      long temp = dvs;
      long multiple = 1;

      // Double temp until it exceeds dvd
      while ((temp << 1) <= dvd) {
        temp <<= 1;        // same as temp * 2
        multiple <<= 1;    // same as multiple * 2
      }

      dvd -= temp;
      ans += multiple;
    }

    return (int) (sign == -1 ? -ans : ans);
  }
}
