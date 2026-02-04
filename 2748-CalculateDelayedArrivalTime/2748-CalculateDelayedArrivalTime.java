// Last updated: 2/4/2026, 1:17:05 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
         return (arrivalTime + delayedTime) % 24;

    }
}