/**
 * Created by Joe on 2018/1/29.
 * 404. Sum of Left Leaves
 * https://leetcode.com/problems/sum-of-left-leaves/description/
 */
public class P404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        } else {
            sum += sumOfLeftLeaves(root.left);
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
