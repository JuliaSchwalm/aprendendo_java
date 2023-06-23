package Lista10;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec4 {

    /*. Ler uma matriz G 5 x 5 e criar 2 vetores SL e SC de 5 elementos que contenham
    respectivamente as somas das linhas e das colunas de G. Escrever os vetores
    criados. */
    public static void matriz(int[][] matriz) {
        Scanner ler = new Scanner(System.in);
        int[] vetorSL = new int[5];
        int[] vetorSC = new int[5];

        //lendo a matriz 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz na posicao [" + i + "] [" + j + "]");
                matriz[i][j] = ler.nextInt();
            }
        }

        //laco de linhas
        for (int i = 0; i < matriz.length; i++) {
            //laco de colunas
            for (int j = 0; j < matriz[i].length; j++) {
                //laco do vetor
                for (int l = 0; l < vetorSL.length; l++) {
                    //se o numero do vetor for igual ao da linha
                    //vai somar os valores daquela linha
                    if (l == i) {
                        vetorSL[l] += matriz[i][j];
                    }
                }
            }
        }

        //laco de linhas
        for (int i = 0; i < matriz.length; i++) {
            //laco de colunas
            for (int j = 0; j < matriz[i].length; j++) {
                //laco do vetor
                for (int l = 0; l < vetorSC.length; l++) {
                    //se o numero do vetor for igual ao da coluna
                    //vai somar os valores daquela coluna
                    if (l == j) {
                        vetorSC[l] += matriz[i][j];
                    }
                }
            }
        }
        System.out.println("\n Vetor com a soma das linhas da matriz: \n");

        for (int l = 0; l < vetorSL.length; l++) {
            System.out.println("Vetor na posição [" + l + "] eh: " + vetorSL[l]);
        }

        System.out.println("\n Vetor com a soma das colunas da matriz: \n");

        for (int l = 0; l < vetorSC.length; l++) {
            System.out.println("Vetor na posição [" + l + "] eh: " + vetorSC[l]);
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        matriz(matriz);
    }
}
