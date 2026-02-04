// Last updated: 2/4/2026, 1:17:51 PM
class Solution {
    public int arrangeCoins(int n) {
        // Use long to avoid overflow when computing 8n
        long N = (long) n;
        long k = (long)(Math.sqrt(1 + 8 * N) - 1) / 2;
        return (int) k;
    }
}