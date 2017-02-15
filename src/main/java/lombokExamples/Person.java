package lombokExamples;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 15/02/2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Slf4j
public class Person {
    private String name;
    private int age;
    @Singular
    private List<String> beers;

    @Singular("oneFish")
    private Map<String,Integer> fish;

    public void init(){

    }


    public static void main(String[] args) {
        Person person = Person.builder().age(38).name("Eyal").beer("Leff").beer("Gold").build();
    }



}









