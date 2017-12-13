/**
 * Created by Joe on 2017/12/13.
 * https://leetcode.com/problems/reshape-the-matrix/description/
 */
public class P566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m =nums[0].length;

        if (n * m != r * c) {
            return nums;
        }

        int[] oneDimenson = new int[n * m];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                oneDimenson[count] = nums[i][j];
                count++;
            }
        }

        int[][] reshape = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshape[i][j] = oneDimenson[i * c + j];
            }
        }

        return reshape;
    }
}
