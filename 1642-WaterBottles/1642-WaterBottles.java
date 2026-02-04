// Last updated: 2/4/2026, 1:17:29 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = 0;
        int empty = 0;

        while (numBottles > 0) {
            // Drink all full bottles
            totalDrunk += numBottles;
            empty += numBottles;
            numBottles = 0;

            // Exchange empty bottles for new full ones
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }

        return totalDrunk;
    }
}