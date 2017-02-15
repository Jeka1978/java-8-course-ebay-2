package callbackPattern;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "java", "JaVa", "GROOVY", "scala");
        int counter = ListUtil.countDuplicates("java", strings, (t1, t2) -> t1.equalsIgnoreCase(t2));
        System.out.println("counter = " + counter);

    }
}
