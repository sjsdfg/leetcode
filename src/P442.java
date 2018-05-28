import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Joe on 2018/5/28.
 * 442. Find All Duplicates in an Array
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
 */
public class P442 {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.size());

        map.forEach((key, value) -> {
            if (value > 1) {
                list.add(key);
            }
        });

        return list;
    }
}
