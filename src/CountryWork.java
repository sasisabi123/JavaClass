import java.util.ArrayList;

public class CountryWork {
    //Write a java to declare ArrayList and add 10 city names to it. Also, print all details.
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add ("Kathmandu");
        cities.add ("Tokyo");
        cities.add ("Springs");
        cities.add ("Dallas");
        cities.add ("FortWorth");
        cities.add ("Euless");
        cities.add ("Pokhara");
        cities.add ("Seoul");
        cities.add ("Beijing");
        cities.add ("Grand Praire");

        for (String city:cities){
            System.out.println(city);
        }


    }
}
