// Last updated: 2/4/2026, 1:17:21 PM
import java.util.*;

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<String, Long> ratioCount = new HashMap<>();
        long result = 0;

        for (int[] rect : rectangles) {
            int w = rect[0];
            int h = rect[1];
            int g = gcd(w, h);

            // Reduce ratio to simplest form
            int rw = w / g;
            int rh = h / g;
            String key = rw + "/" + rh;

            long count = ratioCount.getOrDefault(key, 0L);
            result += count; // each previous rectangle with same ratio forms a pair
            ratioCount.put(key, count + 1);
        }

        return result;
    }

    // Helper function to compute gcd
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}