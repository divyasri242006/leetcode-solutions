// Last updated: 2/4/2026, 1:17:43 PM
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(nums, left, mid);

        // Sort right half
        mergeSort(nums, mid + 1, right);

        // Merge the two halves
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Merge elements in sorted order
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        // Copy back to original array
        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }
}