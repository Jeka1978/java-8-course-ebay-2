package toMapExample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Evegeny on 16/02/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private int price;

    public Product(int price) {
        this.price = price;
    }
}
