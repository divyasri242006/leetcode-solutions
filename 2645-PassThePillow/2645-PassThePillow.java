// Last updated: 2/4/2026, 1:17:10 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int t = time % cycle;

        if (t < n) {
            return 1 + t; // forward direction
        } else {
            return n - (t - (n - 1)); // backward direction
        }
    }
}    

   