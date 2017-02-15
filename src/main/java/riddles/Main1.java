package riddles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class Main1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Arnold", "Silvester", "Chuck Norris", "Van Dam"));
        String personToRemove = "Arnold";

        strings.removeIf(s -> s.equals(personToRemove));

        System.out.println(strings);

    }
}
