// Last updated: 2/7/2026, 7:20:30 PM
1class Solution {
2    public int climbStairs(int n) {
3     if(n<=2){
4        return n;
5     }   
6     int prev2=1;
7     int prev1=2;
8     for(int i=3;i<=n;i++){
9        int current=prev1+prev2;
10        prev2=prev1;
11        prev1=current;
12     }
13     return prev1;
14    }
15}