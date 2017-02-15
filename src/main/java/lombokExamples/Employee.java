package lombokExamples;


import lombok.Data;
import lombok.experimental.Delegate;

/**
 * Created by Evegeny on 15/02/2017.
 */
@Data
public class Employee {
    @Delegate
    private Person person;

    public static void main(String[] args) {
        Employee employee = new Employee();

    }
}
