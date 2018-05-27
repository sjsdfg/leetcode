/**
 * Created by Joe on 2018/5/27
 * 189. Rotate Array
 * https://leetcode.com/problems/rotate-array/description/
 */
public class P189 {
    public void rotate(int[] nums, int k) {
        // if k > nums.length. there will do some repeat rotation
        // so, you should get the real step you should do.
        k %= nums.length;

        // then, rotation
        int[] newNum = new int[nums.length];

        int index = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            newNum[index] = nums[i];
            index++;
        }

        for (int i = 0; i < nums.length - k; i++) {
            newNum[index] = nums[i];
            index++;
        }

        System.arraycopy(newNum, 0, nums, 0, nums.length);
    }
}