import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a,b,c,d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int diferenca = ((a * b) - (c * d));

        System.out.println("DIFERENÇA = " + diferenca);
        sc.close();


    }
}
