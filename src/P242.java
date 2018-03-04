/**
 * Created by Joe on 2018/3/4
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/description/
 */
public class P242 {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}