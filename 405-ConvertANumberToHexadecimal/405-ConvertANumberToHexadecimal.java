// Last updated: 2/4/2026, 1:17:52 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        // Hex characters
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        // Treat num as unsigned 32-bit
        long n = num & 0xffffffffL;
        
        while (n > 0) {
            int remainder = (int)(n & 15); // last 4 bits
            sb.append(hexChars[remainder]);
            n >>>= 4; // unsigned right shift by 4 bits
        }
        
        return sb.reverse().toString();
    }
}