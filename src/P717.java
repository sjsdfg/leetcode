/**
 * Created by Joe on 2018/1/17.
 * 717. 1-bit and 2-bit Characters
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/description/
 */
public class P717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int lastStep = 1;
        while (i < bits.length) {
            if (bits[i] == 0) {
                i++;
                lastStep = 1;
            }
            else {
                i += 2;
                lastStep = 2;
            }
        }

        return lastStep == 1;
    }
}
