import java.util.Scanner;

public class QuintoDesafio {
    public static void main(String[] args) {

        String invertedString = "";

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String string = scan.nextLine();

        for (int i = string.length() - 1; i >= 0; i--) {
            invertedString += string.charAt(i);
        }

        System.out.println("A inversão string informada é: " + invertedString);

    }
}