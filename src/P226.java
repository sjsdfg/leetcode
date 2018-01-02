/**
 * Created by Joe on 2018/1/2.
 * 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/description/
 */
public class P226 {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            invert(root);
            return root;
        }

        //后续遍历
        public void invert(TreeNode root) {
            if (root == null) return;

            if (root.left != null) invert(root.left);
            if (root.right != null) invert(root.right);

            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
    }
}
