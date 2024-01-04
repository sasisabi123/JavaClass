import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWork {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner sc1= new Scanner (System.in);
        System.out.println("Enter num of the fruits: ");
            int total = sc.nextInt();
            ArrayList<String> fruits=new ArrayList<>();
////
////        fruits.add ("Apple");
////        fruits.add ("Grape");
////        fruits.add ("Oranges");
////        fruits.add ("Pomegranate");
//        for (String fruit: fruits){
//            System.out.println(fruit);
        for (int i= 0; i<total; i++){
            System.out.println("Enter Fruit name: ");
            String fruit= sc1.nextLine();
            fruits.add(fruit);
        }
        System.out.println("all fruits are: ");
        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
