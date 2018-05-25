import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joe on 2018/5/25
 * 532. K-diff Pairs in an Array
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 */
public class P532 {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int key : map.keySet()) {
            if (k == 0 && map.get(key) > 1 || k != 0 && map.containsKey(key - k)) {
                count++;
            }
        }

        return count;
    }
}