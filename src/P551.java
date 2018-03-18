/**
 * Created by Joe on 2018/3/18.
 * 551. Student Attendance Record I
 * https://leetcode.com/problems/student-attendance-record-i/description/
 */
public class P551 {

    public boolean checkRecord(String s) {
        int absent = 0;

        int i = 0;
        while (i < s.length()) {
            //记录缺席次数
            if (s.charAt(i) == 'A') {
                absent++;

                if (absent > 1) {
                    return false;
                }
            } else if (s.charAt(i) == 'L') {
                //记录连续的迟到次数
                int start = i;
                while (i < s.length() && s.charAt(i) == 'L') {
                    i++;
                }

                if (i - start > 2) {
                    return false;
                }

                continue;
            }

            i++;
        }

        return true;
    }
}
