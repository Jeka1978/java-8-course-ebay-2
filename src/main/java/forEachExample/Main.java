package forEachExample;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "java", "JaVa", "GROOVY", "scala");
        strings.forEach(s-> System.out.println(s));

       /* for (String string : strings) {
            System.out.println("string = " + string);   //java 6
        }*/

       /* for (int i = 0; i < strings.size(); i++) {   java 5
            String s = strings.get(i);
            System.out.println("s = " + s);

        }*/
    }
}
