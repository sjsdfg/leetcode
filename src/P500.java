import java.util.stream.Stream;

/**
 * Created by Joe on 2017/12/12.
 */
public class P500 {
    public String[] findWords(String[] words) {
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
}
