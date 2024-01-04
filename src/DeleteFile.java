import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
deleteFile("mouseGanesh.txt");


    }
    public static void deleteFile(String fileName) {
       try {
           File f = new File("C:\\Users\\asham\\OneDrive\\Documents\\" + fileName);
           if (f.delete()) {
                System.out.println("File deleted successfully.");
          } else {
               System.out.println("Error while deleting file.");
           }
       } catch (Exception e) {
            System.out.println("Something went wrong while creating file." + e.getMessage());
        }
   }
}

