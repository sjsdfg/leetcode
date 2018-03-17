import java.util.Arrays;

/**
 * Created by Joe on 2018/3/17.
 * 628. Maximum Product of Three Numbers
 * https://leetcode.com/problems/maximum-product-of-three-numbers/description/
 */
public class P628 {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];
        return a > b ? a : b;
    }
}
