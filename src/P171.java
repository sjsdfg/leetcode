/**
 * Created by Joe on 2018/1/22.
 * 171. Excel Sheet Column Number
 * https://leetcode.com/problems/excel-sheet-column-number/description/
 */
public class P171 {
    public int titleToNumber(String s) {
        int sum = 0;
        int addtion = 1;
        for (int i = s.length()-1; i >= 0; i--) {
            sum += (s.charAt(i) - 'A' + 1) * addtion;
            addtion *= 26;
        }

        return sum;
    }
}
