package Lista9;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec1 {

    /*    . Faça um procedimento que recebe, por parâmetro, um vetor A(25) de
    inteiros e substitui todos os valores negativos de A por zero. O vetor A deve
    retornar alterado.*/
    public static int[] Vetor(int[] vetorA) {
        //laço para saber se o numero é menor que 0
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 0) {
                vetorA[i] = 0;
            }
        }
        return vetorA;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[25];
        //laço para entrar numeros
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite a posição [" + i + "] do vetor:");
            vetorA[i] = ler.nextInt();
        }
        //chama o metodo
        Vetor(vetorA);
        //laço para mostrar o vetor
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("O vetor na posicao [" + i + "] eh:" + vetorA[i]);
        }
    }
}
