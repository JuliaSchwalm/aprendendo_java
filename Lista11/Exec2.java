package Lista11;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec2 {

    public static char[][] recebeMatriz(char[][] matriz) {
        Scanner ler = new Scanner(System.in);
        //laco para preencher a matriz A
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz na posicao [" + i + "] [" + j + "]");
                matriz[i][j] = ler.next().charAt(0);
            }
        }
        return matriz;
    }

    public static boolean testeMatriz(char[][] matriz) {
        boolean flag = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nLinhas, nColunas;
        //receber tamanho da matriz 
        System.out.println("Informe o numero de linhas da matriz A:");
        nLinhas = ler.nextInt();
        System.out.println("Informe o numero de colunas da matriz A:");
        nColunas = ler.nextInt();
        //criando a matriz 
        char[][] matriz = new char[nLinhas][nColunas];
        //chamando o metodo para preencher
        recebeMatriz(matriz);
        //metodo para testar se é simetrica
        System.out.println("A matriz é simétrica? " + (testeMatriz(matriz)));

    }
}
