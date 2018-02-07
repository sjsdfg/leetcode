import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Joe on 2018/1/29.
 * 100. Same Tree
 * https://leetcode.com/problems/same-tree/description/
 */
public class P100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();

        pQueue.offer(p);
        qQueue.offer(q);

        while (pQueue.size() != 0 && qQueue.size() != 0) {
            TreeNode pHead = pQueue.poll();
            TreeNode qHead = qQueue.poll();

            if (pHead != null && qHead != null) {
                if (pHead.val != qHead.val) {
                    return false;
                }
                pQueue.add(pHead.left);
                pQueue.add(pHead.right);

                qQueue.add(qHead.left);
                qQueue.add(qHead.right);

            } else if (pHead == null && qHead == null) {

            } else {
                return false;
            }
        }

        return pQueue.size() == qQueue.size();
    }
}
