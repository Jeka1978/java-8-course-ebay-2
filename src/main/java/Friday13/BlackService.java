package Friday13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 16/02/2017.
 */
public class BlackService {
    public List<Integer> get13Frayday(int from, int to) {
        LocalDate start = LocalDate.of(from, 1, 13);
        LocalDate end = LocalDate.of(to, 12, 13);
        long between = ChronoUnit.MONTHS.between(start, end);
        Map<Integer, Long> map = Stream.iterate(start, localDate -> localDate.plusMonths(1)).limit(between)
                .filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()));

 map.entrySet().stream().sorted((o1, o2) -> (int) (o1.getValue() - o2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

//        System.out.println(sortedMap);

        return null;
    }

    public static void main(String[] args) {
        new BlackService().get13Frayday(1900, 2010);
    }
}





