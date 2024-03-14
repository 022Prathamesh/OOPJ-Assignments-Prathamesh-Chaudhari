import java.util.Scanner;

public class Vowel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char inputChar = scanner.next().charAt(0);

       
        inputChar = Character.toLowerCase(inputChar);

        if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
            System.out.println( " vowel.");
        } else if ((inputChar >= 'a' && inputChar <= 'z') && !(inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u')) {
            System.out.println("consonant.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
