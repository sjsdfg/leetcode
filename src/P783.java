/**
 * Created by Joe on 2018/3/13.
 *
 * 783. Minimum Distance Between BST Nodes
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/
 */
public class P783 {
    private Integer pre = null;
    private Integer min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        postOrder(root);
        return min;
    }

    private void postOrder(TreeNode root) {
        if (root == null) return;

        postOrder(root.left);

        if (pre != null) {
            min = min < Math.abs(pre - root.val)? min : Math.abs(pre - root.val);
        }
        pre = root.val;

        postOrder(root.right);
    }
}
