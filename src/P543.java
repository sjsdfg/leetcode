/**
 * Created by Joe on 2018/3/17.
 * 543. Diameter of Binary Tree
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 */
public class P543 {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        postOrder(root);

        return max;
    }

    int postOrder(TreeNode root) {
        if (root == null) return 0;

        int left = postOrder(root.left);
        int right = postOrder(root.right);

        max = max > left + right ? max : left + right;

        return left > right ? left + 1 : right + 1;
    }
}
