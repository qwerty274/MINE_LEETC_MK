class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,n,dp);
    }
    static int solve(int i,int n, int[] dp){
        if(i==n){
            return 1;
        }
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];

        int oneStep= solve(i+1,n,dp);
        int twoStep= solve(i+2,n,dp);
        dp[i]= oneStep+twoStep;
        return dp[i] ;
    }
}