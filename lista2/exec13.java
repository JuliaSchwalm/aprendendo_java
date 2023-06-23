
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class exec13 {
     /**
     * 
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
    
     int maças;
     
     System.out.println("Escreva o numero de maças compradas:");
     maças = ler.nextInt();
    
     //menos de uma duzia: R$ 0,30
     //mais de uma duzia: R$ 0,25
     if (maças < 12){
     System.out.println("O valor das maças e: R$" + (maças*0.30));
     }
     else {
     System.out.println("O valor das maças e: R$" + (maças*0.25));
     }
   }   
}
