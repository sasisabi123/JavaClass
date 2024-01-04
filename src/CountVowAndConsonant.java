import java.util.Scanner;

public class CountVowAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word or sentence: ");
        String word = sc.nextLine().toLowerCase();
        System.out.println("The length of name is " + word.length());
        int vowelCt = 0;
        int consonantCt = 0;
        String vstring= " ";
        String ccount= " ";
        for (int i = 0; i <word.length(); i++) {
            char ch= word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCt++;
                vstring += ch+", ";
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                consonantCt++;
                ccount += ch+ ", ";
            }
            }
                System.out.println("Vowels: " + vowelCt);
        System.out.println("Vowels: "+ vstring);
                System.out.println("Consonants: " + consonantCt);
        System.out.println("Vowels: "+ ccount);
            }

            }




