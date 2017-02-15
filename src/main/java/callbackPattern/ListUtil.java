package callbackPattern;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class ListUtil {
    @SneakyThrows
    public static <T> int countDuplicates(T t, List<T> list, Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.equals(t1,t)) {
                counter++;
                Thread.sleep(111);
            }
        }
        return counter;
    }

    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
            Thread.sleep(delay);
        }
    }

    public static <T> void sortAndPrint(List<T> list, Comparator<T> comparator) {
        Stream<T> sorted = list.stream().sorted(comparator).parallel().sequential();
        sorted.forEach(System.out::println);
//        list.forEach(System.out::println);
    }

    public int myCompare(int x){
        return 2;}


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "java", "JaVa", "GROOVY", "scala");
        forEachWithDelay(strings,555,s -> System.out.println(s));
        sortAndPrint(strings,String::compareTo);


        List<Integer> integers = Arrays.asList(1, 2, 3);
        integers.sort(Integer::compareTo);
    }
}























