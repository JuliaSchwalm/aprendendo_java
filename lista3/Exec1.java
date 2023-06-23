
package Lista3;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec1 {
        /**
     * 
     * @param args
     */
    /**Escreva um programa para ler 2 valores (se o segundo valor informado for ZERO deve ser lido um
novo valor) e imprimir o resultado da divisão do primeiro pelo segundo. (Utilizar a estrutura
ENQUANTO com teste no final).
* */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
       double num1 = 0 , num2 = 0;
      
      System.out.println("Informe o primeiro numero:");
      num1 = ler.nextDouble();

      do {
      System.out.println ("Informe o segundo numero:");
      num2 = ler.nextDouble();
      }while (num2 == 0);
      System.out.println ("A divisao dos numeros informados é:" + (num1/num2));
   }
}
