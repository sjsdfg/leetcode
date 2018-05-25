/**
 * Created by Joe on 2018/5/25
 * 581. Shortest Unsorted Continuous Subarray
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 */
public class P581 {
    public int findUnsortedSubarray(int[] nums) {
        int max = nums[0], min = nums[nums.length - 1];
        int start = 0;
        int end = -1;
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            } else if (max > nums[i]) {
                end = i;
            }
        }

        for (int i = nums.length - 2; i > -1; i--) {
            if (min < nums[i]) {
                start = i;
            } else if (min > nums[i]) {
                min = nums[i];
            }
        }
        return end - start + 1;
    }

    public static void main(String[] args) {
        System.out.println(new P581().findUnsortedSubarray(new int[]{1, 2, 3, 4}));
    }
}