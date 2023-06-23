package Lista6;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec7 {

    /*  . Crie um vetor A com 15 elementos inteiros. Em seguida, você deverá
    construir um vetor B de mesmo tipo e tamanho, porém, cada elemento de B
    deverá ser o quadrado do respectivo elemento de A. */
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];
        Scanner ler = new Scanner(System.in);
        int aux = 0;

        //inserindo valores para o vetor
        for (int i = 0; i < 15; i++) {
            System.out.println("\nInsira 15 numeros inteiros[" + i + "] : ");
            vetorA[i] = ler.nextInt();
        }

        //fazendo o quadrado do vetor A
        for (int i = 0; i < 15; i++) {
            vetorB[i] = vetorA[aux] * vetorA[aux];
            //mostrando o vetor B
            System.out.println("O quadrado do elemento [" + i + "] é:" + vetorB[i]);
            aux++;
        }

    }
}
