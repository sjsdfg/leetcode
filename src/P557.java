/**
 * Created by Joe on 2017/12/12.
 */
public class P557 {
    public String reverseWords(String s) {
        if (s == null)
            return null;
        if (s == "") {
            return "";
        }

        String[] strs = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (String str : strs) {
            StringBuilder tempBuilder = new StringBuilder(str);

            String prefix = index == 0 ? "" : " ";
            stringBuilder.append(prefix + tempBuilder.reverse());
            index++;
        }

        return stringBuilder.toString();
    }
}
