/*
https://leetcode.com/problems/find-pivot-index/

Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers 
to the right of the index.[Equilibrium point]

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Example 1:
Input: nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.

Example 2:
Input: nums = [1, 2, 3]
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
Note:

The length of nums will be in the range [0, 10000].
Each element nums[i] will be an integer in the range [-1000, 1000].

*/
public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        return pivotInLinearTime(nums);
    }

    private int pivotUsingBruteForce(int[] nums) {
        int answer = -1;
        // For every index, check left sum and right sum.
        // If equal then we have found our answer
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                rightSum += nums[k];
            }
            if (leftSum == rightSum) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    private int pivotInLinearTime(int[] nums) {
        //First calculate the total sum of the array
        //Right sum at any point can be calculated as = (total sum - left sum seen till now - currentElement)
        int answer = -1;
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                answer = i;
                break;
            }
            leftSum += nums[i];
        }
        return answer;
    }
}