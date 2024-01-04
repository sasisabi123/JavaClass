import java.util.HashMap;

public class HashWork {
    public static void main(String[] args) {
        HashMap<String, Double> laptop = new HashMap<String, Double>();
        laptop.put("sony", 1000.0);
        laptop.put("Dell", 500.0);
        laptop.put("HP", 200.0);
        laptop.put ("lenovo",100.0);
        //System.out.println(laptop.get("HP"));

       for(String lap : laptop.keySet()) {
           //System.out.println(laptop.get(lap));
           System.out.println("Laptop is: " + lap + " Price is: " + laptop.get(lap));

        }
    }
}
