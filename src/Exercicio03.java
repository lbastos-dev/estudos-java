import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double pi = 3.14159;
        Double raio = sc.nextDouble();
        Double area = pi * Math.pow(raio,2);

        System.out.printf("A = %.4f%n ", area);
        sc.close();





    }
}
