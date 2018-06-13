/**
 * Created by Joe on 2018/6/13
 * 198. House Robber
 * https://leetcode.com/problems/house-robber/description/
 */
public class P198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length < 2) return nums[0];

        int[] amounts = new int[nums.length];
        amounts[0] = nums[0];
        amounts[1] = Math.max(nums[0], nums[1]);

        // 判断是否盗取当前房屋
        for (int i = 2; i < nums.length; i++) {
            amounts[i] = Math.max(nums[i] + amounts[i - 2], amounts[i - 1]);
        }

        return amounts[nums.length - 1];
    }
}