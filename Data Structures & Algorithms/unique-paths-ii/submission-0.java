class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
     int dp[][]=new int[m][n];
     for(int i=0;i<m;i++){
        Arrays.fill(dp[i],-1);
     }
      if(obstacleGrid[0][0]!=1){
        return func(0,0,m,n,dp,obstacleGrid);
      }
        else{
            return 0;
        }
       
    }
   public static int func(int i,int j,int m,int n, int dp[][],int grid[][]){
     if(i>=m || j>=n)
    return 0;
    if(i==m-1 && j==n-1)
    return 1;
   if(grid[m-1][n-1]==1)
   return 0;
    if(dp[i][j]!=-1)
    return dp[i][j];

    if(grid[i][j]==1)
    return 0;

    return dp[i][j]=func(i+1,j,m,n,dp,grid)+func(i,j+1,m,n,dp,grid);
   }
}