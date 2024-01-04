import java.util.ArrayList;
import java.util.Collections;

public class ListWork {
    public static void main(String[] args) {
        ArrayList <String> names= new ArrayList<>();
        names.add ("Shashi");
        names.add ("Biswo");
        names.add ("Istar");

        //names.set (0,"Bishnu");
        Collections.sort(names); // Collections.reverseOrder());

        for (String name: names){
            System.out.println(name);
        }

//        System.out.println(names.get(1));
//        System.out.println(names.size());


    }
}
