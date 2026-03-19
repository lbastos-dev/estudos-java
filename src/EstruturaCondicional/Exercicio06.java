package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();

        if (num < 0 ){
            System.out.println("Fora do Intervalo");
        }else if(num >= 75){
            System.out.println("Intervalo 75,100");
        }else if (num <= 75 && num > 50) {
            System.out.println("Intervalo 50,75");
        } else if (num <= 50 && num > 25) {
            System.out.println("Intervalo 25,50");
        } else if (num <= 25 && num >= 0) {
            System.out.println("Intervalo 0,25");
        }
    }
}
