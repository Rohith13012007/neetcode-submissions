class Solution {
    public int uniquePaths(int m, int n) {
      int dp[][]=new int[m][n];
      for(int i=0;i<m;i++){
        Arrays.fill(dp[i],-1);
      }  
      return func(0,0,m,n,dp);
    }
    public static int func(int i,int j,int m,int n,int dp[][]){
       if(i>=m || j>=n)
        return 0;
        if(i==m-1 && j==n-1){
            return 1;
        }
        
        if(dp[i][j]!=-1)
        return dp[i][j];

        dp[i][j]=func(i+1,j,m,n,dp)+func(i,j+1,m,n,dp);
        return dp[i][j];
    }
}
