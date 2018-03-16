import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joe on 2018/3/16.
 * 409. Longest Palindrome
 * https://leetcode.com/problems/longest-palindrome/description/
 */
public class P409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                Integer nums = map.get(c);
                map.put(c, nums + 1);

            } else {
                map.put(c, 1);
            }
        }

        int sum = 0;
        boolean hasOdd = false;

        for (Integer num : map.values()) {
            if (num % 2 == 0) {
                sum += num;
            } else {
                sum += num-1;
                hasOdd = true;
            }
        }

        return hasOdd ? sum + 1 : sum;
    }
}
