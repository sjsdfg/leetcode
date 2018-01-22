/**
 * Created by Joe on 2018/1/22.
 * 492. Construct the Rectangle
 * https://leetcode.com/problems/construct-the-rectangle/description/
 */
public class P492 {
    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);
        while (area%w!=0) w--;
        return new int[]{area/w, w};
    }

    public static void main(String[] args) {
        System.out.println(new P492().constructRectangle(1));
    }
}
