package flatMapExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.regex.Pattern.compile;

/**
 * Created by Evegeny on 16/02/2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("C:\\temp\\yest.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Stream<String> lines = bufferedReader.lines();
//        Stream<String> words = lines.map(String::toLowerCase).flatMap(line -> stream(line.split("\\W")));
        Stream<String> words = lines.flatMap(compile("\\W")::splitAsStream);
        long count = words.peek(System.out::println).filter("yesterday"::equalsIgnoreCase).count();
        System.out.println("count = " + count);
        bufferedReader.close();


    }
}







