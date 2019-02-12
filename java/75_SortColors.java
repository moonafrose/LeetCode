/*
Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same
color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Follow up:

A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number
of 0's, then 1's and followed by 2's.
Could you come up with a one-pass algorithm using only constant space?

*/
public class Solution {
    public void sortColors(int[] nums) {
        // Since the question is asking to use one-pass algo, we'll use Dutch National Flag Algorithm
        // Here 1 is our pivot point

        // initialize three variables which will be pointers to 0, 1 and 2 resp
        int i = 0, j = 0, k = nums.length - 1;

        while (j <= k) {
            if (nums[j] == 0) {
                swap(nums, i, j);
                i++; // incrementing i and j since 0 is pushed to left side
                j++;
            } else if (nums[j] == 1) {
                j++; // already 1 is in its place, so leave it as it is and move ahead
            } else {
                swap(nums, j, k);
                k--; // not incrementing j since we may get a 1 from right side while swapping
            }
        }
    }

    private void swap(int[] nums, int from, int to) {
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}