import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        //Write a Java program to check if the number is odd or even.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2==0)
            System.out.println("Number is even");
            else
            System.out.println("Number is odd");

    }

}
