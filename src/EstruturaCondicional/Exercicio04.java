package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;

        if (horaInicial < horaFinal ) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)",duracao);

    }
}
