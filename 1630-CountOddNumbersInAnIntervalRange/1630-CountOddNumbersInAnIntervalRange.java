// Last updated: 2/4/2026, 1:17:32 PM
class Solution {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;
        // If either boundary is odd, add 1
        if (low % 2 != 0 || high % 2 != 0) {
            count++;
        }
        return count;
    }
}