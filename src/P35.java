/**
 * Created by Joe on 2018/5/22.
 */
public class P35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        if (target > nums[end]) {
            return nums.length;
        }

        while (start <= end) {
            int middle = (start + end) / 2;

            if (nums[middle] > target) {
                end = middle - 1;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return start;
    }
}
