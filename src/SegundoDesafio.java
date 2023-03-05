import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        int previousNumber = 0;
        int currentNumber = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scan.nextInt();

        while (currentNumber < number) {
            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }

        if (currentNumber == number) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci!");
        } else  {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci!");
        }

    }
}
