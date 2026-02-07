// Last updated: 2/7/2026, 6:55:33 PM
1class Solution {
2    public int maxFreqSum(String s) {
3
4        int[] freq = new int[26];   // frequency of each letter
5
6        // Count frequencies
7        for (char ch : s.toCharArray()) {
8            freq[ch - 'a']++;
9        }
10
11        int maxVowel = 0;
12        int maxConsonant = 0;
13
14        // Check each character
15        for (int i = 0; i < 26; i++) {
16            char letter = (char) (i + 'a');
17
18            if (isVowel(letter)) {
19                maxVowel = Math.max(maxVowel, freq[i]);
20            } else {
21                maxConsonant = Math.max(maxConsonant, freq[i]);
22            }
23        }
24
25        return maxVowel + maxConsonant;
26    }
27
28    // Helper method to check vowel
29    private boolean isVowel(char ch) {
30        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
31    }
32}
33