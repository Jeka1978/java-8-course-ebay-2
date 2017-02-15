package callbackPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 15/02/2017.
 */
@Data
@AllArgsConstructor
public class Person {
    private String name;
    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person moshe = new Person("Moshe");
        PersonUtil.doSomethingWithPerson(moshe,person -> person.printName());
    }


}















