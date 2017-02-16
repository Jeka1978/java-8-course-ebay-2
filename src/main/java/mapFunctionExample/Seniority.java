package mapFunctionExample;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by Evegeny on 16/02/2017.
 */
@AllArgsConstructor
public enum Seniority {
    JUNIOR(1, 14000), MIDDLE(14001, 21000), SENIOR(21001, 30000);

    private final int min;
    private final int max;


    public static Seniority findBySalary(int salary) {
        Seniority[] seniorities = values();
        Optional<Seniority> optional = Arrays.stream(seniorities).
                filter(seniority -> salary > seniority.min && salary < seniority.max).findFirst();
        return optional.get();

    }

    public static void main(String[] args) {
        Seniority seniority = findBySalary(15000);
        System.out.println("seniority = " + seniority);
    }

}







