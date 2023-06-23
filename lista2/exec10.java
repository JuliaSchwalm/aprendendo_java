
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class exec10 {
  /**
     * 
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
     double num;
     
     System.out.println("Escreva um numero:");
     num = ler.nextDouble();
     
     if (num>=0){
     System.out.println("O numero e positivo.");
     }
     else {
     System.out.println("O numero e negativo.");
     }
   } 
}
