/**
 * Created by Joe on 2018/5/23.
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/description/
 */
public class P88 {
    // 实现一个插入排序
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            nums1 = nums2;
            return;
        }

        for (int i = 0; i < n; i++) {
            int insertIndex = m;

            //首先寻找插入位置
            while (insertIndex > 0 && nums2[i] < nums1[insertIndex - 1]) {
                insertIndex--;
            }

            // 接下来进行移动
            for (int j = m; j > insertIndex; j--) {
                nums1[j] = nums1[j - 1];
            }

            nums1[insertIndex] = nums2[i];
            m++;
        }
    }

    public static void main(String[] args) {
        new P88().merge(new int[]{2, 0}, 1, new int[]{1}, 1);
    }
}
