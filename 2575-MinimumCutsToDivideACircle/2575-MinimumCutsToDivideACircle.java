// Last updated: 2/4/2026, 1:17:11 PM
class Solution {
    public int numberOfCuts(int n) {
        if (n==1) return 0;
        if(n%2==0) return n/2;
        else return n;
        
    }
}