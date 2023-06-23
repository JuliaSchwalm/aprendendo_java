package Lista6;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec4 {

    /*   Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada
    informação no seu respectivo vetor. Imprima a idade e a altura na ordem
    inversa a ordem lida.*/
    public static void main(String[] args) {
        double[] altura = new double[5];
        int[] idade = new int[5];
        double[] alturaInversa = new double[5];
        int[] idadeInversa = new int[5];
        Scanner ler = new Scanner(System.in);
        int aux = 0, aux2 = 0;

        //inserindo valores para o vetor
        for (int i = 0; i < 5; i++) {
            System.out.println("\nInsira as idades de 5 pessoas[" + i + "] : ");
            idade[i] = ler.nextInt();
        }
        //inserindo valores para o vetor
        for (int i = 0; i < 5; i++) {
            System.out.println("\nInsira os nomes dos funcionarios de TADS2_LP1[" + i + "] : ");
            altura[i] = ler.nextDouble();
        }
        //invertendo os valores da idade
        for (int i = 4; i >= 0; i--) {
            idadeInversa[aux] = idade[i];
            System.out.println("A idade [" + i + "] é:" + idadeInversa[aux]);
            aux++;
        }
        //invertendo os valores de altura
        for (int i = 4; i >= 0; i--) {
            alturaInversa[aux2] = altura[i];
            System.out.println("A altura [" + i + "] é:" + alturaInversa[aux2]);
            aux2++;
        }
    }
}
