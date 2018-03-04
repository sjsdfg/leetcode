/**
 * Created by Joe on 2018/3/4.
 * 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 */
public class P387 {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
