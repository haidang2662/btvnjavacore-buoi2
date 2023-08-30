import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("input date : ");
            String date = sc.nextLine();
            LocalDate localDate = LocalDate.parse(date,df);
            System.out.println("date : " + localDate);
            LocalDate now = LocalDate.now();
            System.out.println(now.getYear());
            System.out.println(localDate.getYear());
            int age = now.getYear()-localDate.getYear();
            System.out.println(age);



    }
}
