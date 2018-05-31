import java.util.HashSet;
import java.util.Set;

/**
 * Created by Joe on 2018/5/31.
 * 565. Array Nesting
 * https://leetcode.com/problems/array-nesting/description/
 */
public class P565 {
    public int arrayNesting(int[] nums) {
        // 构建Set用于记录环
        Set<Integer> set = new HashSet<>();

        // 用于判断当前节点是否经过遍历
        // 如果经过遍历，则从该结点出发的路径是前面路径的子集，会导致重复运算
        boolean[] visited = new boolean[nums.length];

        // 遍历判断
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            int index = nums[i];
            set.clear();
            while (!set.contains(index)) {
                visited[index] = true;
                set.add(index);
                index = nums[index];
            }
            max = Math.max(max, set.size());
        }

        return max;
    }
}
