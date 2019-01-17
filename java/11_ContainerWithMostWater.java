/*

https://leetcode.com/problems/container-with-most-water/

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
*/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        return maximumAreaOptimized(height);
    }

    private int maximumAreaBruteForce(int[] height) {
        // since we need area between two heights, calculate all possible pair heights
        // and update maximum.
        // Because of gravity, only the lowest wall decides how much water it can retain
        int n = height.length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (Math.abs(j - i)));
                }
            }
        }
        return maxArea;
    }

    private int maximumAreaOptimized(int[] height) {
        /*
         * The basic idea was that we hope the lowest wall will be as high as possible
         * and the distance between two walls as far as possible. We'll solve using two
         * pointer approach. One pointer moves one step forward only when it’s height is
         * lower than the other side, say we want to find the highest walls from both
         * side and updating the maximal volume each step while they moving towards
         */
        // Because of gravity, only the lowest wall decides how much water it can retain
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}