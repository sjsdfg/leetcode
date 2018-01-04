/**
 * Created by Joe on 2018/1/4.
 * 258. Add Digits
 * https://leetcode.com/problems/add-digits/description/
 */
public class P258 {
    public int addDigits(int num) {
        return num==0?0:(num%9==0?9:(num%9));
    }
}
