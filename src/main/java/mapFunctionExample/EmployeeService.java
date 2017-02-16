package mapFunctionExample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Evegeny on 15/02/2017.
 */
public class EmployeeService {

    public Map<Seniority, List<Employee>> mapBySeniority(List<Employee> employees) {

       return
        employees.stream().collect(Collectors.groupingBy(emp -> Seniority.findBySalary(emp.getSalary())));

    }


    public long calcTotalSalary(List<Employee> employees) {
        return employees.stream().unordered().mapToInt(Employee::getSalary).sequential().sum();
    }
}
