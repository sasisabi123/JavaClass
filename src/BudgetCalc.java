import java.util.Scanner;

public class BudgetCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your budget:");
        int budget = sc.nextInt();
        if (budget>=500)
        {        System.out.println("Budget is high");
    }else{
        System.out.println("Your budget is okay");

        }
    }
}
