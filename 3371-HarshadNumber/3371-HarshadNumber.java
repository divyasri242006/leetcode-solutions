// Last updated: 2/4/2026, 1:16:53 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check Harshad condition
        if (x % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }
}