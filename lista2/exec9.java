
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class exec9 {
  /**
     * 
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in);
   
     double num;
     
     System.out.println("Escreva um numero:");
     num = ler.nextDouble();
     
     if (num>10){
     System.out.println("E maior que 10.");
     }
     else {
     System.out.println("Nao e maior que 10.");
     }
   }
}
