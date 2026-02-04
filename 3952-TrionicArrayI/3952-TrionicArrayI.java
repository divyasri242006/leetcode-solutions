// Last updated: 2/4/2026, 1:16:58 PM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 1;

        // 1️⃣ strictly increasing
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }

        // must have at least one increase
        if (i == 1 || i == n) return false;

        // 2️⃣ strictly decreasing
        while (i < n && nums[i] < nums[i - 1]) {
            i++;
        }

        // must have at least one decrease
        if (i == n) return false;

        // 3️⃣ strictly increasing again
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }

        // must reach the end
        return i == n;
    }
}
