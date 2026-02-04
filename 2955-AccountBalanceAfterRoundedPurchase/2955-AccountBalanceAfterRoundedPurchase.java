// Last updated: 2/4/2026, 1:17:01 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount = ((purchaseAmount + 5) / 10) * 10;
        return 100 - roundedAmount;
   
    }
}