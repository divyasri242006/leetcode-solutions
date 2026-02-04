// Last updated: 2/4/2026, 1:17:38 PM

        class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = -1;  // last element should be -1
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRight;   // replace with greatest to the right
            if (current > maxRight) {
                maxRight = current;  // update maxRight
            }
        }
        return arr;
    }
}
