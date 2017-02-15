package callbackPattern;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class PersonUtil {
    public static void doSomethingWithPerson(Person p,Consumer<Person> consumer) {
        consumer.accept(p);
        Function<Integer,Integer> intConsumer = Integer::new;


    }
}
