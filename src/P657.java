/**
 * Created by Joe on 2017/11/25.
 * Judge Route Circle
 * https://leetcode.com/problems/judge-route-circle/description/
 */
public class P657 {
    public boolean judgeCircle(String moves) {
        int u = 0, d = 0, r = 0, l = 0;

        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);

            switch(c) {
                case 'U': u++;break;
                case 'D': d++;break;
                case 'R': r++;break;
                case 'L': l++;break;
            }
        }

        if (u == d && r == l) {
            return true;
        }
        return false;
    }
}
