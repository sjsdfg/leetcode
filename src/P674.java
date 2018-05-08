/**
 * Created by Joe on 2018/4/16.
 * 674. Longest Continuous Increasing Subsequence
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
 */
public class P674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] length = new int[nums.length];
        length[0] = 1;

        int maxLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                length[i] = length[i-1] + 1;
            } else {
                length[i] = 1;
            }

            maxLen = Math.max(maxLen, length[i]);
        }

        return maxLen;
    }
}
