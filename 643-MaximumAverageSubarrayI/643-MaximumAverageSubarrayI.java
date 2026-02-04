// Last updated: 2/4/2026, 9:07:04 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        long windowSum=0;
4        for(int i=0;i<k;i++){
5            windowSum+=nums[i];
6        }
7        long maxSum=windowSum;
8        for(int i=k;i<nums.length;i++){
9            windowSum+=nums[i]-nums[i-k];
10            maxSum=Math.max(maxSum,windowSum);
11        }
12        return (double)maxSum/k;
13    }
14}