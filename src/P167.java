/**
 * Created by Joe on 2018/3/4
 * 167. Two Sum II - Input array is sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class P167 {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] == target) break;
            else if (numbers[start] + numbers[end] < target) start++;
            else end--;
        }

        return new int[]{start + 1, end + 1};
    }
}