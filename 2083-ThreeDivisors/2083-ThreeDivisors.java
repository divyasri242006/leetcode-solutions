// Last updated: 2/4/2026, 1:17:22 PM
class Solution {
    public boolean isThree(int n) {
        int root = (int) Math.sqrt(n);
        
        // Check if n is a perfect square
        if (root * root != n) {
            return false;
        }
        
        // Check if root is prime
        return isPrime(root);
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}