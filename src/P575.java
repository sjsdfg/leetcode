import java.util.HashSet;
import java.util.Set;

/**
 * Created by Joe on 2017/12/13.
 */
public class P575 {
    public int distributeCandies(int[] candies) {
        int half = candies.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }

        return set.size() > half ? half : set.size();
    }
}
