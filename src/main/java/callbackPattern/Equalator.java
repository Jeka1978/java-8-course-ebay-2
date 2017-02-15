package callbackPattern;

/**
 * Created by Evegeny on 15/02/2017.
 */
@FunctionalInterface
public interface Equalator<T> {
    boolean equals(T t1, T t2);
}
