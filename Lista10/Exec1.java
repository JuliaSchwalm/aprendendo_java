
package Lista10;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec1 {
    /*  . Ler uma Matriz M 7x7 (7 linhas e 7 colunas), calcular e escrever as seguintes
    somas:
    a. de todos os elementos da linha 3;
    b. da Coluna 2;
    c. da diagonal principal;
    d. da diagonal secundária;
    e. de todos os elementos da matriz;  */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [][] matriz = new int [7][7];
        int linha3 = 0, coluna2 = 0, diaPrincipal = 0, diaSecundaria = 0, todosElementos = 0;
        //laço para preencher a matriz
         for(int i=0; i<matriz.length; i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.println("matriz na posição ["+i+"] ["+j+"]");
                matriz [i][j] = ler.nextInt();
            }
        }
        //fazendo as somas que o exercicio pede
         for(int i=0; i<matriz.length; i++){
            for (int j=0;j<matriz[i].length;j++){
                //se estiver na linha 3 a variavel recebe os valores
                if (i == 3){
                    linha3 += matriz [i][j];
                }
                //se estiver na coluna 2 variavel recebe os valores
                if (j == 2){
                    coluna2+=matriz[i][j];
                }
                //se a linha e a coluna tiverem o mesmo numero, entao esta na diagonal principal
                if (i == j){
                    diaPrincipal += matriz [i][j];
                }
                //se a soma das posições forem iguais ao numero da ultima coluna
                //variavel recebe os valores
                if (i+j == 6){
                    diaSecundaria += matriz [i][j];
                }
                //soma de toda matriz
                todosElementos += matriz[i][j];
            }
        }
         System.out.println("A soma dos numeros da linha 3 eh: "+linha3);
         System.out.println("A soma da coluna 2 eh: "+coluna2);
         System.out.println("A soma da diagonal principal eh: "+diaPrincipal);
         System.out.println("A soma da diagonal secundaria eh: "+diaSecundaria);
         System.out.println("A soma de toda a matriz eh: "+todosElementos);
    }
}
