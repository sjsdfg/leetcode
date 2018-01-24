/**
 * Created by Joe on 2018/1/24.
 * 169. Majority Element
 * https://leetcode.com/problems/majority-element/description/
 */
public class P169 {
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }
}
