import java.util.Arrays;

public class CombineArray {
    public static void main(String[] args) {
        String []names={"Ram","Hari", "Gopal"};
        String [] name ={ "Prem", "Jane", "Smith"};
        String [] combine= new String[names.length +name.length];
        for (int i=0; i<names.length; i++) {
            combine[i] = names[i];
        }

            for (int i =0; i<name.length; i++){
                combine[i+names.length]= name[i];

            }
        System.out.println(Arrays.toString(combine));
        }
        }




