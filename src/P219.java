import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by Joe on 2018/5/22.
 * 219. Contains Duplicate II
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 */
public class P219 {
    public boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                if (Math.abs(i - map.get(nums[i])) <= k){
                    return true;
                }
                map.replace(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
