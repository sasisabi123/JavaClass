import java.io.FileWriter;

public class FileName {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Shahsi.txt");
            fw.write("My name is Shashi");
            fw.close();
            System.out.println("wrote Successfully");
        }catch (Exception ex){
            System.out.println("sth went worng");

        }
    }
}
