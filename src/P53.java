/**
 * Created by Joe on 2018/5/8
 * 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/description/
 */
public class P53 {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }
}