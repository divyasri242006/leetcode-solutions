// Last updated: 2/5/2026, 11:10:32 PM
1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5
6        for (int i = 0; i < n; i++) {
7
8            if (nums[i] == 0) {
9                result[i] = 0;
10            } else {
11                int newIndex = (i + nums[i]) % n;
12
13                // fix negative modulo
14                if (newIndex < 0) {
15                    newIndex += n;
16                }
17
18                result[i] = nums[newIndex];
19            }
20        }
21
22        return result;
23    }
24}
25