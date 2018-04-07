/**
 * Created by Joe on 2018/4/7
 * 695. Max Area of Island
 * https://leetcode.com/problems/max-area-of-island/description/
 */
public class P695 {
    private int m;
    private int n;

    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    //计算面积
                    int area = getArea(grid, i, j);
                    //获取最大面积
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        return maxArea;
    }

    private int getArea(int[][] grid, int i, int j) {
        //边界值判断
        if(i >= m || j >= n || i < 0 || j < 0 || grid[i][j] == 0) return 0;
        //置0为了减少重复计算
        grid[i][j] = 0;

        return 1 +
                //四个方向递归
                getArea(grid, i + 1, j) +
                getArea(grid, i, j + 1) +
                getArea(grid, i-1, j) +
                getArea(grid,i, j-1);
    }
}