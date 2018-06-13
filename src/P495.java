/**
 * Created by Joe on 2018/5/28.
 * 495. Teemo Attacking
 * https://leetcode.com/problems/teemo-attacking/description/
 */
public class P495 {
    public int findPoisonedDuration(int[] ts, int d) {
        if(ts == null || ts.length <= 0 || d == 0) return 0;
        int ret = 0;
        for(int i = 1; i < ts.length; i++)
            ret += Math.min(ts[i] - ts[i-1], d);
        return ret + d;
    }
}
