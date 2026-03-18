package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int qnt = sc.nextInt();

        if ( id > 5 ){
            System.out.println("Esta opção não está no Menu");
        } else if (id == 5) {
            double calc = qnt * 1.50;
            System.out.printf("Total: R$%.2f",calc );
        } else if ( id == 4 ){
            double calc = qnt * 2.00;
            System.out.printf("Total: R$%.2f",calc );
        } else if ( id == 3 ){
            double calc = qnt * 5.00;
            System.out.printf("Total: R$%.2f",calc );
        } else if ( id == 2 ) {
            double calc = qnt * 4.50;
            System.out.printf("Total: R$%.2f", calc);
        } else if ( id == 1 ) {
            double calc = qnt * 4.00;
            System.out.printf("Total: R$%.2f", calc);
        }

        sc.close();
    }
}
