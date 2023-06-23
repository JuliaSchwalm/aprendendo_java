
package exec4;
import java.util.Scanner;
        
/**
 *
 * @author Julia Schwalm Gomes
 */

public class exec4 {
      /**
     * exercÃ­cio 1 da lista 1
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in);
     
      float A, B, C;
      
      System.out.println("Informe um valor para A:");
      A = ler.nextFloat();
      
      System.out.println("Informe um valor para B:");
      B = ler.nextFloat();
      
      System.out.println("Informe um valor para C:");
      C = ler.nextFloat();
           
       System.out.println("O valor da expressão A*B+A*C é:" + ( A*B+A*C ));   
   } 
}