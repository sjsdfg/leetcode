/**
 * Created by Joe on 2018/5/27
 * 665. Non-decreasing Array
 * https://leetcode.com/problems/non-decreasing-array/description/
 */
public class P665 {
    public boolean checkPossibility(int[] nums) {
        boolean modified = false;

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] > nums[i + 1]) {
                if (modified) // if modified a number already
                    return false;
                else // if it is first time to modify a number
                {
                    if (i - 1 < 0 || nums[i + 1] >= nums[i - 1]) // if nums[i+1] is larger or equal all numbers before nums[i]
                        nums[i] = nums[i + 1]; // change nums[i] as same as nums[i+1]
                    else // if nums[i+1] is not larger than all numbers before nums[i]
                        nums[i + 1] = nums[i]; // change nums[i+1] as same as nums[i]

                    modified = true;
                }
            }
        }

        return true;

    }
}