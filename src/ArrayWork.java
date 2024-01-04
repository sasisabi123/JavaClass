import java.util.Scanner;

public class ArrayWork {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] fruits= {"","","","",""};

for (int i=0;i<fruits.length; i++){
    System.out.println("Enter fruit name "+ (i+1)+ ": ");
    fruits[i]=sc.nextLine ();
}
for(int i=0; i<fruits.length; i++){
            System.out.println(("ID "+ (i+1)+ " fruit is : " +fruits[i]));
        }
}
}

