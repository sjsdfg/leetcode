/**
 * Created by Joe on 2018/4/7
 * 766. Toeplitz Matrix
 * https://leetcode.com/problems/toeplitz-matrix/description/
 */
public class P766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (!check(matrix, i, 0, m, n)) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!check(matrix, 0, i, m, n)) {
                return false;
            }
        }

        return true;
    }

    public boolean check(int[][] matrix, int i, int j, int m, int n) {
        if (i + 1 < m && j + 1 < n) {
            return matrix[i][j] == matrix[i + 1][j + 1] && check(matrix, i + 1, j + 1, m, n);
        }
        return true;
    }
}