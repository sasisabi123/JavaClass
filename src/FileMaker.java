import java.io.File;

public class FileMaker {
    public static void main(String[] args) {
        try {
            File f = new File("contact.txt");
            if (f.createNewFile()) {

                System.out.println("File created successfully.");
            } else {
                System.out.println("File not created.");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}



