/**
 * Created by Joe on 2018/4/7.
 * 746. Min Cost Climbing Stairs
 * https://leetcode.com/problems/min-cost-climbing-stairs/description/
 */
public class P746 {
    public int minCostClimbingStairs(int[] cost) {
        if(cost == null)
            return 0;
        if(cost.length == 1)
            return cost[0];
        if(cost.length == 2)
            return Math.min(cost[0],cost[1]);
        int[] tmp = new int[cost.length];//记录着必须选择第i阶台阶时，最小代价
        tmp[0] = cost[0];
        tmp[1] = cost[1];
        for(int i = 2; i < tmp.length; i++) {
            tmp[i] = Math.min(tmp[i - 2], tmp[i - 1]) + cost[i];
        }
        return Math.min(tmp[tmp.length - 1], tmp[tmp.length - 2]); //最后一步可以从最后一个台阶或者倒数第二个台阶跨越
    }
}
