import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Joe on 2018/5/25
 * 414. Third Maximum Number
 * https://leetcode.com/problems/third-maximum-number/description/
 */
public class P414 {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            set.add(num);
        }

        Integer[] arr = set.toArray(new Integer[0]);

        return arr.length < 3? arr[0] : arr[2];
    }

    public static void main(String[] args) {
        System.out.println(new P414().thirdMax(new int[] {2, 2, 3, 1}));
    }
}
