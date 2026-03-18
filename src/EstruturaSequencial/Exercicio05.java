package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();


        double salario = horasTrabalhadas * valorHora;
        System.out.printf("FUNCIONARIO = %1d%n" +
                "SALARIO = %.2f%n",funcionario,salario);



    }
}
