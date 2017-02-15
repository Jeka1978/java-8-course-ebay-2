package multipleInheritance;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class Son implements Mother, Father {

    @Override
    public void handleBaby() {
        Father.super.handleBaby();
    }
}
