import java.io.FileWriter;
import java.util.Scanner;

public class ContactSaver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your phone number: ");
        String number = sc.nextLine();
        try {
                FileWriter fw = new FileWriter("Contact.csv", true);
                fw.write(name + "," + number + "\n");
                fw.close();
                System.out.println("Contact" + name + " saving is successful.");
            } catch (Exception ex) {
                System.out.println("sth went wrong");

            }

        }
    }



