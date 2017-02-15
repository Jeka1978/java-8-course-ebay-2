package serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.function.Supplier;

/**
 * Created by Evegeny on 15/02/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stam implements Serializable {
    private Supplier supplier;


}
