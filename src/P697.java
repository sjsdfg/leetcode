import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joe on 2018/3/14.
 * 697. Degree of an Array
 * https://leetcode.com/problems/degree-of-an-array/description/
 */
public class P697 {
    public int findShortestSubArray(int[] nums) {
        //创建一个HashMap
        //key为值
        //value为 degree, start, end的三元组
        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //如果没有这个值
            if (!map.containsKey(nums[i])) {
                int[] value = new int[]{1, i, i};
                map.put(nums[i], value);
            } else {
                int[] value = map.get(nums[i]);
                //修改度和结束位置
                value[0] += 1;
                value[2] = i;

                map.put(nums[i], value);
            }
        }

        int maxDegree = 0;
        int smallest = Integer.MAX_VALUE;


        for (Integer key : map.keySet()) {
            int[] value = map.get(key);
            if (value[0] > maxDegree) {
                maxDegree = value[0];
                smallest = value[2] - value[1] + 1;
            } else if (value[0] == maxDegree) {
                smallest = smallest < value[2] - value[1] + 1? smallest : value[2] - value[1] + 1;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        new P697().findShortestSubArray(new int[]{1,2,2,3,1});
    }
}
