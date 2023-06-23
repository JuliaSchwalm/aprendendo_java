package Lista10;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec3 {

    /*Faça um programa que o usuário informará o número de linhas e colunas da
    matrizA e da matrizB. Após isso:
    a. Preencher ambas matrizes com valores inteiros;
    b. Criar um menu para que o usuário opte por:
    i. (1) somar
    ii. (2) subtrair
    iii. (3) multiplicar
    iv. (0) sair
    Obs.:
(i) Somente é possível somar/subtrair duas matrizes, se os
tamanhos de ambas forem iguais;
(ii) Uma matrizA só pode ser multiplicada pela matrizB, se o número
de colunas da matrizA for igual ao número de linhas da matrizB;*/
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nLinhasA, nColunasA, nLinhasB, nColunasB, opt = 1;
        //receber tamanho da matriz A
        System.out.println("Informe o numero de linhas da matriz A:");
        nLinhasA = ler.nextInt();
        System.out.println("Informe o numero de colunas da matriz A:");
        nColunasA = ler.nextInt();
        //receber tamanho da matriz B
        System.out.println("Informe o numero de linhas da matriz B:");
        nLinhasB = ler.nextInt();
        System.out.println("Informe o numero de colunas da matriz B:");
        nColunasB = ler.nextInt();

        int[][] matrizA = new int[nLinhasA][nColunasA];
        int[][] matrizB = new int[nLinhasB][nColunasB];
        int[][] matrizC = new int[nLinhasA][nColunasB];
        //laco para preencher a matriz A
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.println("matriz A na posicao [" + i + "] [" + j + "]");
                matrizA[i][j] = ler.nextInt();
            }
        }
        //laco para preencher a matriz B
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.println("matriz B na posicao [" + i + "] [" + j + "]");
                matrizB[i][j] = ler.nextInt();
            }
        }
        do {
            System.out.println("\n O que voce deseja fazer com as matrizes? \n");
            System.out.println("    (1) somar\n"
                    + "    (2) subtrair\n"
                    + "    (3) multiplicar\n"
                    + "    (0) sair");
            System.out.println("Digite o numero desejado:");
            opt = ler.nextInt();

            //fazendo as opcoes necessarias
            switch (opt) {
                case 1:
                    //somando as matrizes 
                    if (nLinhasA == nLinhasB && nColunasA == nColunasB) {
                        for (int i = 0; i < matrizC.length; i++) {
                            for (int j = 0; j < matrizC[i].length; j++) {
                                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                            }
                        }
                        //imprimindo a nova matriz 
                        System.out.println("\nA matriz da soma eh:\n");
                        for (int i = 0; i < matrizC.length; i++) {
                            for (int j = 0; j < matrizC[i].length; j++) {
                                System.out.println("Posicao [" + i + "] [" + j + "]: " + matrizC[i][j]);
                            }
                        }
                    } else {
                        System.out.println("Opcao invalida! As matrizes nao sao do mesmo tamanho.");
                    }
                    break;

                case 2:
                    //subtraindo as matrizes 
                    if (nLinhasA == nLinhasB && nColunasA == nColunasB) {
                        for (int i = 0; i < matrizA.length; i++) {
                            for (int j = 0; j < matrizA[i].length; j++) {
                                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                            }
                        }
                        //imprimindo a matriz
                        System.out.println("\nA matriz da subtração eh:\n");
                        for (int i = 0; i < matrizA.length; i++) {
                            for (int j = 0; j < matrizA[i].length; j++) {
                                System.out.println("Posicao [" + i + "] [" + j + "]: " + matrizC[i][j]);
                            }
                        }
                    } else {
                        System.out.println("Opcao invalida! As matrizes nao sao do mesmo tamanho.");
                    }
                    break;

                case 3:
                    //multiplicando as matrizes 
                    if (nColunasA == nLinhasB) {
                        for (int i = 0; i < nLinhasA; i++) {
                            for (int j = 0; j < nColunasB; j++) {
                                for (int k = 0; k < nColunasA; k++) {
                                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                                }
                            }
                        }
                        //imprimindo a matriz
                        System.out.println("\nA matriz da multiplicacao eh:\n");
                        for (int i = 0; i < matrizC.length; i++) {
                            for (int j = 0; j < matrizC[i].length; j++) {
                                System.out.println("Posicao [" + i + "] [" + j + "]: " + matrizC[i][j]);
                            }
                        }
                    } else {
                        System.out.println("Opcao invalida! As matrizes nao tem o mesmo numero de linhas e colunas");
                    }
                    break;

                case 0:
                    System.out.println("Operação finalizada com sucesso!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opt != 0);
    }

}
