// Last updated: 2/4/2026, 1:21:10 PM
class Solution {
   
        public int addDigits(int num) {
    if (num == 0) {
        return 0;
    }
    return 1 + (num - 1) % 9;
}
}