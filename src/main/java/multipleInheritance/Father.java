package multipleInheritance;

/**
 * Created by Evegeny on 15/02/2017.
 */
public interface Father extends Grandy {
  default   void handleBaby(){
      Grandy.super.handleBaby();
      System.out.println("Come to me, baby");
  }
}
