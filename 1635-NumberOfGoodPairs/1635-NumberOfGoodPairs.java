// Last updated: 2/4/2026, 1:17:31 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int result = 0;
        
        for (int num : nums) {
            result += count[num];
            count[num]++;        
        }
        
        return result;
    }
}