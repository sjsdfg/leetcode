/**
 * Created by Joe on 2018/3/7.
 * 563. Binary Tree Tilt
 * https://leetcode.com/problems/binary-tree-tilt/description/
 */
public class P563 {
    private int result = 0;

    public int findTilt(TreeNode root) {
        postTravel(root);

        return result;
    }

    public int postTravel(TreeNode root) {
        if (root == null) return 0;

        int left = postTravel(root.left);
        int right = postTravel(root.right);

        result += Math.abs(left - right);

        return left + right + root.val;
    }
}
