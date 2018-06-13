import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joe on 2018/6/13
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/description/
 */
public class P70 {
    public int climbStairs(int n) {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);

        for (int i = 3; i < n + 1; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }

        return list.get(n);
    }

    public static void main(String[] args) {
        new P70().climbStairs(4);
    }
}