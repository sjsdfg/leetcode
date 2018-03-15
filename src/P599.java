
import java.util.*;

/**
 * Created by Joe on 2018/3/15.
 * 599. Minimum Index Sum of Two Lists
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
 */
public class P599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        //加入值和索引
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        //查找最小值
        int least = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int index = map.get(list2[i]);
                if (i + index < least) {
                    least = i + index;
                    list.clear();
                    list.add(list2[i]);
                } else if (i + index == least) {
                    list.add(list2[i]);
                }
            }
        }

        return list.size() == 0? null : list.toArray(new String[0]);
    }
}
