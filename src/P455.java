import java.util.Arrays;

/**
 * Created by Joe on 2018/3/5.
 * 455. Assign Cookies
 * https://leetcode.com/problems/assign-cookies/description/
 */
public class P455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for(int j=0;i<g.length && j<s.length;j++) {
            if(g[i]<=s[j]) i++;
        }
        return i;
    }
}
