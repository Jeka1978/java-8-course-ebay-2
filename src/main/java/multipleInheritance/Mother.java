package multipleInheritance;

/**
 * Created by Evegeny on 15/02/2017.
 */
public interface Mother {

   default void handleBaby(){
       System.out.println("COME TO ME, BABY");
   }
}
