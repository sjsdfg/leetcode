/**
 * @author Joe
 * @date 2018/9/20
 * 303. Range Sum Query - Immutable
 * https://leetcode.com/problems/range-sum-query-immutable
 */
public class P303 {
    private int[] n;
    public P303(int[] nums) {
        n = nums;
        for(int i = 1; i < nums.length; i++) n[i] += n[i-1];
    }

    public int sumRange(int i, int j) {
        return i == 0 ? n[j] : n[j] - n[i-1];
    }
}