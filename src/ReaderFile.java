import java.io.File;
import java.util.Scanner;

public class ReaderFile {
    public static void main(String[] args) {
        double amount= 0;
        try{
            File myobj= new File ("income.csv");
            Scanner reader = new Scanner(myobj);
            while (reader.hasNextLine()) {
                String mydata = reader.nextLine();
                String [] data= mydata.split (",");
                amount += Double.parseDouble(data [1]);
                //System.out.println(mydata);
            }
            reader.close();

            }catch (Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
        System.out.println("Total Amount is : "+amount);

    }
}
