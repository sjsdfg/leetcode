/**
 * Created by Joe on 2018/4/7.
 * 268. Missing Number
 * https://leetcode.com/problems/missing-number/description/
 */
public class P268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num: nums)
            sum += num;

        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }
}
