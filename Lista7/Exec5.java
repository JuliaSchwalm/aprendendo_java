package Lista7;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec5 {
    //Elabore um Método ImprimeVetor que recebe um vetor de 5 inteiros por
    //valor e imprime seus valores 

    public static void imprimeVetor(int num) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os valores para o vetor:");
            vetor[i] = ler.nextInt();
        }
        // vetor = {1,2,3,4,5}
        for (int i = 0; i < 5; i++) {
            System.out.println("O vetor de [" + i + "] é:" + vetor[i]);
        }
    }

    public static void main(String[] args) {

        imprimeVetor(0);
    }
}
