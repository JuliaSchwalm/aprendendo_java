package Lista6;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec1 {
    /*Implemente um algoritmo que, dado um vetor X de 15 inteiros, você deve
    calcular a soma de todos os elementos presentes no vetor e a soma de todos
    os elementos pares.*/
    public static void main(String[] args) {
        int[] vetorX = new int[15];
        Scanner ler = new Scanner(System.in);
        int acumuladorPar = 0, acumulador = 0;
        //inserindo valores para o vetor
        for (int i = 0; i < 15; i++) {
            System.out.println("\nInsira 15 numeros para X[" + i + "] : ");
            vetorX[i] = ler.nextInt();
        }
        //somando e mostrando os valores de todos os elementos do vetor
        for (int i = 0; i < 15; i++) {
            acumulador += vetorX[i];
        }
        System.out.println("\nA soma de todos os numeros do vetorX"
                + " eh:\n" + acumulador);
        //somando e mostrando os elementos pares do vetor
        for (int i = 0; i < 15; i++) {
            if (vetorX[i] % 2 == 0) {
                acumuladorPar += vetorX[i];
            }
        }
        System.out.println("\nA soma de todos os elementos pares do vetorX"
                + " eh:\n" + acumuladorPar);
    }
}
