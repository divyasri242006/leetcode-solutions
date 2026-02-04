// Last updated: 2/4/2026, 1:21:06 PM

        class Solution {
    public boolean canWinNim(int n) {
        // You can win if n is not a multiple of 4
        return n % 4 != 0;
    }
}