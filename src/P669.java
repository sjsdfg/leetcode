/**
 * Created by Joe on 2017/12/14.
 * https://leetcode.com/problems/trim-a-binary-search-tree/description/
 */
public class P669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return null;

        if (root.val < L) return trimBST(root.right, L, R);
        if (root.val > R) return trimBST(root.left, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);

        return root;
    }
}
