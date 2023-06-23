package Lista3;

import java.util.Scanner;

/**
 *
 * @author Julia Schwalm Gomes
 */
public class Exec14 {
            /**
     * 
     * @param args
     */
    /**Escreva um programa que lê o tamanho (N) de um quadrado e, em seguida, imprime um
quadrado, NxN daquele tamanho com asteriscos. O tamanho máximo aceitável para um quadrado é igual
a 30. Considere o exemplo abaixo:
* */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
       int N, aux, aux2;
      
      System.out.println("Informe o tamanho do quadrado:");
      N = ler.nextInt();
     
      if (N<=30){
     //preenche as linhas
     for(aux = N; aux > 0; aux--){
         //preenche as colunas
            for(aux2 = N; aux2 > 0; aux2--){ 
              System.out.print(" * ");
            }
       //deixa em linhas certas
       System.out.println();  
      }
      }
    }
}
