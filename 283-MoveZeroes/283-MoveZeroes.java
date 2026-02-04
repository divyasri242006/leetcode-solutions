// Last updated: 2/4/2026, 9:12:44 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int index = 0;
4
5        // Move non-zero elements forward
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] != 0) {
8                nums[index++] = nums[i];
9            }
10        }
11
12        // Fill remaining positions with zero
13        while (index < nums.length) {
14            nums[index++] = 0;
15        }
16    }
17}
18