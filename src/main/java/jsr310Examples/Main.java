package jsr310Examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by Evegeny on 16/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1978, 10, 3);
        LocalDate now = LocalDate.now();
        LocalDate maxim = myBirthday.withDayOfMonth(2).withMonth(2);
        long between = ChronoUnit.WEEKS.between(maxim, myBirthday);
        System.out.println("between = " + between);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy/mm/dd");
        String format = now.format(dateTimeFormatter);
    }
}
