/*
https://leetcode.com/problems/k-closest-points-to-origin/

We have a list of points on the plane.  Find the K closest points to the origin (0, 0).
(Here, the distance between two points on a plane is the Euclidean distance.)
You may return the answer in any order.  The answer is guaranteed to be unique (except for the order that it is in.)

 
Example 1:

Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation: 
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].

Example 2:

Input: points = [[3,3],[5,-1],[-2,4]], K = 2
Output: [[3,3],[-2,4]]
(The answer [[-2,4],[3,3]] would also be accepted.)

Note:

1 <= K <= points.length <= 10000
-10000 < points[i][0] < 10000
-10000 < points[i][1] < 10000

https://leetcode.com/problems/k-closest-points-to-origin/discuss/220235/Java-Three-solutions-to-this-classical-K-th-problem.
 */
import java.util.Arrays;

public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        return sortAllValuesInAscendingOrderFromOrigin(points, K);
    }

    private int[][] sortAllValuesInAscendingOrderFromOrigin(int[][] points, int K) {
        // Basically we are sorting all the points w.r.t the origin
        // Distance of a point P(x, y) from the origin(0,0) is given by Math.sqrt(x^2 + y^2)
        Arrays.sort(points, (p1, p2) -> {
            int distance_p1_from_origin = p1[0] * p1[0] + p1[1] * p1[1];
            int distance_p2_from_origin = p2[0] * p2[0] + p2[1] * p2[1];
            return distance_p1_from_origin - distance_p2_from_origin;
        });
        //Once sorted in ascending order, return first K entries
        return Arrays.copyOfRange(points, 0, K);
    }
}