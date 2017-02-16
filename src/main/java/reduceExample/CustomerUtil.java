package reduceExample;

import mapFunctionExample.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 16/02/2017.
 */
public class CustomerUtil {
    public static String concatAllNames(List<Customer> customers) {
        Optional<String> reduce = customers.stream().map(Customer::getName).reduce((s1, s2) -> s1 + "," + s2);
        if (reduce.isPresent()) {
            return reduce.get();
        } else {
            return "";
        }
    }

    public static List<String> filterAndSort(List<Customer> customers) {
        return customers.stream().map(Customer::getName).filter(name -> name.equals(name.toUpperCase()))
                .sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(new Customer("Hadas"), new Customer("Irena"), new Customer("Ran"));
        String names = concatAllNames(customers);
        System.out.println("names = " + names);
        List<Customer> customers2 = Arrays.asList(new Customer("OR"),new Customer("HADAS"), new Customer("Irena"), new Customer("Ran"));
        System.out.println(filterAndSort(customers2));

        Stream<Employee> stream = Stream.of(new Employee(100));
        stream.collect(Collectors.toMap(Employee::getSalary, employee -> employee));


//        Random random = new Random();
//        Stream.iterate(1,integer -> random.nextInt(100)).sorted().limit(50).forEach(System.out::println);


    }


}
