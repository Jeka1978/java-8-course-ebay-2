package multipleInheritance;

/**
 * Created by Evegeny on 15/02/2017.
 */
public interface Grandy {
    default void handleBaby(){
        System.out.println("I don't care, I'm to old");
    }
}
