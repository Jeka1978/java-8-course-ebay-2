package mapFunctionExample;

import java.util.List;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class EmployeeService {


    public long calcTotalSalary(List<Employee> employees) {
        return employees.stream().unordered().mapToInt(Employee::getSalary).sequential().sum();
    }
}
