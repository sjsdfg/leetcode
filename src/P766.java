/**
 * Created by Joe on 2018/4/7
 * 766. Toeplitz Matrix
 * https://leetcode.com/problems/toeplitz-matrix/description/
 */
public class P766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //遍历第一列
        for (int i = 0; i < m; i++) {
            if (!check(matrix, i, 0, m, n)) {
                return false;
            }
        }
        //遍历第一行
        for (int i = 0; i < n; i++) {
            if (!check(matrix, 0, i, m, n)) {
                return false;
            }
        }

        return true;
    }

    public boolean check(int[][] matrix, int i, int j, int m, int n) {
        //边界判断
        if (i + 1 < m && j + 1 < n) {
            //判断和下一个值是否相同
            //相同则继续判断
            return matrix[i][j] == matrix[i + 1][j + 1] && check(matrix, i + 1, j + 1, m, n);
        }
        return true;
    }
}