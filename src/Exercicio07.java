import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double trianguloRetangulo = ( (A*C) / 2 );
        double circuloRaio = (pi * (Math.pow(C,2)) );
        double areaTrapezio = ((A + B) * C / 2 );
        double areaQuadrado = Math.pow(B,2);
        double areaRetangulo = ( A * B );

        System.out.printf("TRIANGULO : %.3f%n" +
                "CIRCULO: %.3f%n" +
                "TRAPEZIO: %.3f%n" +
                "QUADRADO: %.3f%n" +
                "RETANGULO %.3f%n ",trianguloRetangulo,circuloRaio,areaTrapezio,areaQuadrado,areaRetangulo);
    }
}
