package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();


        if ( B % A == 0 && A < B ){
            System.out.println("SÃO MULTIPLOS");
        }
        else if (A % B == 0 && A > B){
            System.out.println("SÃO MULTIPLOS");
        }else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }


    }
}
