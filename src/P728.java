import java.util.LinkedList;
import java.util.List;

/**
 * Created by Joe on 2017/11/25.
 * Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/description/
 */
public class P728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (isSelf(i)) {
                numbers.add(i);
            }
        }

        return numbers;
    }

    public boolean isSelf(int num) {
        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            int value = (numStr.charAt(i) - '0');
            //这里需要注意，value作为除数可能为0
            //所以含有0的数一定不是 自除数
            if (value == 0 || num % value != 0) {
                return false;
            }
        }

        return true;
    }
}

