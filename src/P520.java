/**
 * Created by Joe on 2018/1/3.
 * 520. Detect Capital
 * https://leetcode.com/problems/detect-capital/description/
 */
public class P520 {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|[A-Z]?[a-z]*");
    }
}
