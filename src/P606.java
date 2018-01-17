/**
 * Created by Joe on 2018/1/17.
 * 606. Construct String from Binary Tree
 * https://leetcode.com/problems/construct-string-from-binary-tree/description/
 */
public class P606 {
    class Solution {
        public String tree2str(TreeNode t) {
            if(t==null)
                return "";
            if(t.left==null && t.right==null)
                return t.val+"";
            if(t.right==null)
                return t.val+"("+tree2str(t.left)+")";
            return t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";
        }
    }
}
