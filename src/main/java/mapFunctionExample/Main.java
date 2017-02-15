package mapFunctionExample;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Random random = new Random();

        int iterNum = 10000000;
        for (int i = 0; i < iterNum; i++) {
            employees.add(new Employee(random.nextInt(100)));

        }

        EmployeeService employeeService = new EmployeeService();
        long start = System.nanoTime();
        long totalSalary = employeeService.calcTotalSalary(employees);
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println("totalSalary = " + totalSalary);



    }
}
