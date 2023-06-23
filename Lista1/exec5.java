package exec5;
import java.util.Scanner;
        
/**
 *
 * @author Julia Schwalm Gomes
 */

public class exec5 {
      /**
     * exercÃ­cio 1 da lista 1
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in);
     
      int atual, nasceu;
      
      System.out.println("Informe o ano atual:");
      atual = ler.nextInt();
      
      System.out.println("Informe o ano em que voce nasceu:");
      nasceu = ler.nextInt();
      
           
       System.out.println("Sua idade é:" + ( atual - nasceu ));   
   } 
}