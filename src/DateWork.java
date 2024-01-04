import java.time.LocalDate;
import java.util.Scanner;

public class DateWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birth year: ");
        int birthYear = sc.nextInt();

        LocalDate ld = LocalDate.now();
        int age = ld.getYear() - birthYear;
        System.out.println("Age= " + age);

    }
}









