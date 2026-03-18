import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva dois números inteiros para somá-los");

        Integer num1 = sc.nextInt();
        Integer num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("SOMA = " + soma);

    }
}
