package callbackPattern;

import lombok.SneakyThrows;

import java.util.List;

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
}
