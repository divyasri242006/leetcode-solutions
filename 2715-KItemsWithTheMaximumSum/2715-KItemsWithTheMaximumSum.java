// Last updated: 2/4/2026, 1:17:07 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        
       int takeOnes = Math.min(k, numOnes);
        int remaining = k - takeOnes;
        if (remaining <= numZeros) {
            return takeOnes; 
        }
        int takeNegOnes = remaining - numZeros;
        return takeOnes - takeNegOnes;
    }
}
  
    