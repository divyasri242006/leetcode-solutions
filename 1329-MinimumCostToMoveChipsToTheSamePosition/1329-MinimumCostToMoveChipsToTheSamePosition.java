// Last updated: 2/4/2026, 1:17:37 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int countOdd = 0;
        int countEven = 0;
        
        for (int p : position) {
            if (p % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        
        return Math.min(countOdd, countEven);
    }
}