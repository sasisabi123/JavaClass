import java.io.FileWriter;
import java.util.Scanner;

public class PersonalFianance {
   //enum Category {Income, Expense}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter [E] for Expenses and [I] for income: ");
        String whatToDo= sc.nextLine().toUpperCase();

        System.out.println("Enter category:");
        String category = sc.nextLine();

        System.out.println("Enter amount:");
        double amount = sc1.nextDouble();

        System.out.println("Enter date: ");
        String date = sc.nextLine();

        if(whatToDo.equals("I")){
            saveIncome(category,amount,date);
        }else if(whatToDo.equals("E")){
            saveExpenses(category,amount,date);
        }else{
            System.out.println("Not Found");
        }
    }

    public static void saveIncome(String category,double amount, String date){
       try {
           FileWriter fw = new FileWriter("income.csv", true);
           fw.write(category + "," + amount+"," +date+ "\n");
           fw.close();
           System.out.println("Income saves successfully");
       } catch (Exception ex) {
                System.out.println("Something went wrong");

       }
    }
    public static void saveExpenses(String category, double amount, String date){
        try {
            FileWriter fw = new FileWriter("expenses.csv",true);
            fw.write(category +","+amount+","+date+"\n");
            fw.close();
            System.out.println("Expenses Saved Successfully.");
        }catch (Exception ex){
            System.out.println("Something went wrong.");
        }
    }
    }

