import java.util.Arrays;

/**
 * Created by Joe on 2018/4/6.
 * 561. Array Partition I
 * https://leetcode.com/problems/array-partition-i/description/
 */
public class P561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }

        return sum;
    }
}
