import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Before formatting: " + dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDate = dt.format(dtf);

        System.out.println("After formatting: " + formattedDate);
    }
}