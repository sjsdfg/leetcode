import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joe on 2018/5/14.
 * 118. Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/description/
 */
public class P118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>(i + 1);
            temp.add(0, 1);


            if (i > 0) {
                for (int j = 1; j < i; j++) {
                    temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
                temp.add(1);
            }



            result.add(temp);
        }

        return result;
    }
}
