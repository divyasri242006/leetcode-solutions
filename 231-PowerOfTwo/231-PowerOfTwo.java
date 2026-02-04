// Last updated: 2/4/2026, 1:21:13 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
    if (n<=0) return false;
    return (n & (n-1))==0;
    }
}