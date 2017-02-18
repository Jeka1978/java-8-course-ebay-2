package toMapExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 16/02/2017.
 */
public class EbayUtils {
    public static Map<String, Integer> customerToTotal(List<Purchase> purchases) {
        return purchases.stream().collect(Collectors.toMap(Purchase::getName,
                purchase -> purchase.getProduct().getPrice(), Integer::sum));
    }

    public static Map<String, Long> howManyPurchasesCustomerDid(List<Purchase> purchases) {
        return purchases.stream().collect(Collectors.groupingBy(Purchase::getName, Collectors.counting()));
    }


    public static void main(String[] args) {


        List<Purchase> purchases = Arrays.asList(new Purchase("Alon", new Product("tennis", 12)),
                new Purchase("Alon", new Product("tennis", 12)),
                new Purchase("Alon", new Product("tennis", 12)),
                new Purchase("Moshe", new Product("tennis", 12)),
                new Purchase("Moshe", new Product("tennis", 12)),
                new Purchase("Alon", new Product("tennis", 12)));

        Map<String, Long> stringLongMap = howManyPurchasesCustomerDid(purchases);
        System.out.println("stringLongMap = " + stringLongMap);
    }


}







