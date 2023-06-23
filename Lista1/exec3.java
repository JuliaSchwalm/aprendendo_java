
package exec3;
import java.util.Scanner;
        
/**
 *
 * @author JÃºlia Schwalm Gomes
 */

public class exec3 {
      /**
     * exercício 1 da lista 1
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in);
     
      float num, sgnum;
      
      System.out.println("Informe um numero:");
      num = ler.nextFloat();
      
      System.out.println("Informe outro numero:");
      sgnum = ler.nextFloat();
      
           
       System.out.println("A soma dos numeros e:" + (num + sgnum));   
       System.out.println("A subtração dos numeros e:" + (num - sgnum));
       System.out.println("A multiplicação dos numeros e:" + (num * sgnum));
       System.out.println("A divisao dos numeros e:" + (num / sgnum)); 
   } 
}
