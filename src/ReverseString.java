import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What string would you like to be reverted? ");
        String originalString = scanner.nextLine();
        String newString = "";
        char character;

        for(int i = 0; i < originalString.length(); i++){
            character = originalString.charAt(i);
            newString = character + newString;
        }
        System.out.println("You reverted string: " + newString);
    }
}
