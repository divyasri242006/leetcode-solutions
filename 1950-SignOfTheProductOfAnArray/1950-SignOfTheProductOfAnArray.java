// Last updated: 2/4/2026, 1:17:26 PM
class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        
        for (int num : nums) {
            if (num == 0) {
                return 0; // product becomes zero
            }
            if (num < 0) {
                negativeCount++;
            }
        }
        
        // If negatives are even → product positive
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}