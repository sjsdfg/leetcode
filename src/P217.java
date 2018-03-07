import java.util.HashSet;
import java.util.Set;

/**
 * Created by Joe on 2018/3/7.
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/description/
 */
public class P217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
