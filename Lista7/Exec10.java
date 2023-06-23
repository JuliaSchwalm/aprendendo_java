package Lista7;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec10 {

    /*   Faça um procedimento que recebe, por parâmetro, 2 vetores de 10
    elementos inteiros e que calcule e retorne, também por parâmetro, o vetor
    intersecção dos dois primeiros. */
    public static int vetorA() {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        Scanner ler = new Scanner(System.in);
        int[] vetorC = new int[10];
        int aux = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os numeros para o vetor A:");
            vetorA[i] = ler.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite os numeros para o vetor B:");
            vetorB[i] = ler.nextInt();
        }
        for (int i = 0; i < 10; i++) {

            if (vetorA[i] == vetorB[i]) {
                vetorC[aux] = vetorA[i];
                System.out.println("O vetor de interseccao eh: [" + aux + "]" + vetorC[aux]);
                aux++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        vetorA();
    }
}
