package Lista7;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec8 {
    //. Elabore um Método SomaVetor que recebe um vetor de 5 elementos de
//inteiro por valor e retorna o somatório destes valores. 

    public static void somaVetor(int num) {
        int[] vetor = new int[5];
        int soma = 0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            //lendo valores pro vetor
            System.out.println("Digite um numero para o vetor:");
            vetor[i] = ler.nextInt();
            //somando os valores do vetor
            soma += vetor[i];
        }
        System.out.println("A soma dos numeros do vetor é:" + soma);
    }

    public static void main(String[] args) {

        somaVetor(0);
    }
}
