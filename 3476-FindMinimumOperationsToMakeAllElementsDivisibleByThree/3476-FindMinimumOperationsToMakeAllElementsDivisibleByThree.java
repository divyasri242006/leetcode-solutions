// Last updated: 2/4/2026, 1:16:59 PM
class Solution {
    public int minimumOperations(int[] nums) {
        return (int) Arrays.stream(nums).filter(num->num%3!=0).count();
    }
}