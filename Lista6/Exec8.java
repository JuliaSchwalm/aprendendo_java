package Lista6;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec8 {

    /*Crie um vetor com 10 elementos do tipo double. Alimente este vetor com
    números de 5 a 15. Após isso, cada elemento do respectivo vetor deverá ser
    elevado ao expoente igual a posição do respectivo elemento.
    Ex: Considerando que na posição 3 do vetor temos o número 7, o
    novo valor a ser inserido na respectiva posição 3 deste vetor será o
    resultado de 7ˆ3 = 343. */
    public static void main(String[] args) {
        double[] vetor = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Scanner ler = new Scanner(System.in);

        //fazendo o resultado
        for (int i = 0; i < 10; i++) {
            System.out.println("O resulado de " + vetor[i] + " elevado ao expoente " + i + " na posicao " + i + " é: " + Math.pow(vetor[i], i));
        }

    }
}
