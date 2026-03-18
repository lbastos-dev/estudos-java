import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id1,id2;
        int num1,num2;
        double preco1,preco2;

        id1 = sc.nextInt();
        num1 = sc.nextInt();
        preco1 = sc.nextDouble();

        id2 = sc.nextInt();
        num2 = sc.nextInt();
        preco2 = sc.nextDouble();

        double preco = ((num1 * preco1) + (num2 * preco2));

        System.out.printf("VALOR A PAGAR: %.2f ",preco);



    }
}
