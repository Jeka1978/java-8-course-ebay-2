package serialization;

import java.io.*;
import java.util.function.Supplier;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      /*  Stam stam = new Stam((Supplier&Serializable) () -> {
            System.out.println(123);
            return "asdasd";
        });*/

        String name = "c:\\temp\\stam.txt";
        Stam stam = (Stam) new ObjectInputStream(new FileInputStream(name)).readObject();
        Object o = stam.getSupplier().get();
        System.out.println("o = " + o);
        /*new File(name).createNewFile();
        FileOutputStream fos = new FileOutputStream(name);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(stam);*/
    }
}
