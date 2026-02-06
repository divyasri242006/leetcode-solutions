// Last updated: 2/6/2026, 9:36:54 PM
1import java.util.*;
2
3class Solution {
4    public int minRemoval(int[] nums, int k) {
5        Arrays.sort(nums);
6
7        int n = nums.length;
8        int maxLen = 0;
9        int j = 0;
10
11        for (int i = 0; i < n; i++) {
12            // Move j while condition holds
13            while (j < n && (long) nums[j] <= (long) nums[i] * k) {
14                j++;
15            }
16
17            // window size = j - i
18            maxLen = Math.max(maxLen, j - i);
19        }
20
21        return n - maxLen;
22    }
23}
24