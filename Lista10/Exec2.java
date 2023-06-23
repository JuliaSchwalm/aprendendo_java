package Lista10;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec2 {

    /*Criar os métodos elencados abaixo e fazer o que se pede:
    a. int[][] preencherMatriz(int[][] mat)
    i. //preenche a matriz e retorna a matriz preenchida
    b. void imprimeMatriz(int[][] mat)
    i. //imprime a matriz
    c. int[][] transporMatriz(int[][] mat)
    i. //recebe uma matriz por parâmetro e retorna a sua transposta
    d. No método main, efetuar chamadas para os respectivos métodos.
    Para cada operação, imprima a matrizes resultantes após a
    respectiva execução. Utilize o método imprimeMatriz sempre que for
    imprimir uma matriz; */
    public static int[][] preencherMatriz(int[][] mat) {
        Scanner ler = new Scanner(System.in);
        //preenchendo a matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("matriz na posicao [" + i + "] [" + j + "]");
                mat[i][j] = ler.nextInt();
            }
        }
        return mat;
    }

    public static void imprimeMatriz(int[][] mat) {
        //imprimindo a matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("matriz na posicao [" + i + "] [" + j + "] eh:" + mat[i][j]);
            }
        }
    }

    public static int[][] transporMatriz(int[][] mat) {
        //transpondo a matriz
        int[][] transposta = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                transposta[i][j] = mat[j][i];
            }
        }
        //mat recebe a matriz transposta
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = transposta[i][j];
            }
        }

        return mat;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] mat = new int[3][3];
        //chamando o metodo para preencher
        preencherMatriz(mat);
        //imprimindo a matriz
        imprimeMatriz(mat);
        //transpondo a matriz
        transporMatriz(mat);
        //impprimir a matriz transposta
        System.out.println("\nA matriz transposta eh:\n");
        imprimeMatriz(mat);
    }
}
