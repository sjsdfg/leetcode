/**
 * Created by Joe on 2017/12/27.
 * 521. Longest Uncommon Subsequence I
 * https://leetcode.com/problems/longest-uncommon-subsequence-i/description/
 */
public class P521 {
    public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }
}
