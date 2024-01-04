import java.util.ArrayList;
import java.util.Scanner;

public class CountriesWork {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Scanner sc1= new Scanner (System.in);
        System.out.println("Enter the number of cities you want to display: ");
        int cityNum= sc.nextInt();

        ArrayList <String> cities = new ArrayList<>();

        for (int i=0; i<cityNum; i++){
        System.out.println("Enter the name of a city you want to display: ");
        String city= sc1.nextLine();
        cities.add(city);
        }
        System.out.println("Name of all the cities are: ");
            for (String city: cities){
                System.out.println(city);

            }



    }
}
