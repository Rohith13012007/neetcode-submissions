class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return func(0,nums.length,dp,nums);
    }
    public static int func(int i,int n,int dp[],int arr[]){
        if(i>=n)
        return 0;
        if(dp[i]!=-1)
        return dp[i];
    int skip=0+func(i+1,n,dp,arr);
    int select=arr[i]+func(i+2,n,dp,arr);
    dp[i]= Math.max(skip,select);
    return dp[i];
    }
}
