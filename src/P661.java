import java.util.Arrays;

/**
 * Created by Joe on 2018/3/15.
 * 661. Image Smoother
 * https://leetcode.com/problems/image-smoother/description/
 */
public class P661 {
    private int[][] directions = new int[][] {
            {-1, 1}, //左上
            {0, 1}, //正上
            {1, 1}, //右上
            {-1, 0}, //左
            {1, 0}, //右
            {-1, -1}, //左下
            {0, -1}, //正下
            {1, -1}, //右下
    };

    public int[][] imageSmoother(int[][] M) {
        int m = M.length;
        int n = M[0].length;

        int[][] smoother = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                smoother[i][j] = getValue(M, i, j, m, n);
            }
        }

        return smoother;
    }

    private int getValue(int[][] M, int x, int y, int m, int n) {
        int count = 1;
        int value = M[x][y];

        for (int[] direction : directions) {
            int newX = x + direction[0];
            int newY = y + direction[1];

            if (check(newX, newY, m, n)) {
                value += M[newX][newY];
                count++;
            }
        }

        return value / count;
    }

    private boolean check(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    public static void main(String[] args) {
        int[][] m = new int[][]{
                {1,1,1}, {1,0,1}, {1,1,1}
        };

        int[][] smoother = new P661().imageSmoother(m);

        for (int[] s : smoother) {
            System.out.println(Arrays.toString(s));
        }
    }
}
