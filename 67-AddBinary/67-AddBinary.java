// Last updated: 2/7/2026, 7:12:39 PM
1class Solution {
2    public String addBinary(String a, String b) {
3
4        StringBuilder result = new StringBuilder();
5
6        int i = a.length() - 1;
7        int j = b.length() - 1;
8        int carry = 0;
9
10        // Traverse from right to left
11        while (i >= 0 || j >= 0 || carry == 1) {
12
13            int sum = carry;
14
15            if (i >= 0) {
16                sum += a.charAt(i) - '0';
17                i--;
18            }
19
20            if (j >= 0) {
21                sum += b.charAt(j) - '0';
22                j--;
23            }
24
25            // Append current bit
26            result.append(sum % 2);
27
28            // Update carry
29            carry = sum / 2;
30        }
31
32        // Reverse to get final binary string
33        return result.reverse().toString();
34    }
35}
36
37       