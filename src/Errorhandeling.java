import java.util.Scanner;

public class Errorhandeling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("Enter your birthyear :");
            int birthyear = sc.nextInt();
            int birthdate = 2023 - birthyear;
            System.out.println(" Your birthyear is : " + birthdate);
        }catch (Exception e) {
            System.out.println("You must Enter 4 digit.");
        }finally{
            System.out.println("I am so done.");
        }
    }
}
