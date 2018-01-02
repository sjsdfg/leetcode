/**
 * Created by Joe on 2018/1/2.
 * 136. Single Number
 * https://leetcode.com/problems/single-number/description/
 */
public class P136 {
    public int singleNumber(int[] nums) {
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value ^= nums[i];
        }

        return value;
    }
}
