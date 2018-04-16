import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Joe on 2018/4/16.
 * 747. Largest Number At Least Twice of Others
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
 */
public class P747 {
    public int dominantIndex(int[] nums) {
        int firstMax=0, secondMax=0, k=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]>firstMax){
                secondMax=firstMax;
                firstMax=nums[i];
                k=i;
            }else if(nums[i]>secondMax){
                secondMax=nums[i];
            }
        }

        return (secondMax==0 || firstMax/secondMax>=2) ? k : -1;
    }
}
