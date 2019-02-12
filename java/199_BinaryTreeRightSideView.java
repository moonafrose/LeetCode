
/*
Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---

*/
import java.util.*;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> result = new ArrayList<>();

        /*
         * We'll do simple level order traversal. Since we want to print rightmost node
         * in each level first, we'll push right node first(if any) followed by left
         * node. We'll also maintain a boolean flag to indicate if that is the first
         * rightmost node in that level
         */

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isFirstNodeFromRightSide = true;
            while (size-- > 0) {
                TreeNode temp = queue.poll();
                if (isFirstNodeFromRightSide) {
                    result.add(temp.val);
                    isFirstNodeFromRightSide = false;
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                if (temp.left != null) {
                    queue.add(temp.left);
                }
            }
        }
        return result;
    }
}