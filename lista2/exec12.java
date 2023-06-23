
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class exec12 {
    /**
     * 
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
    
    //int porque ano é inteiro 
     int anoNasc;
     
     System.out.println("Escreva o ano que voce nasceu:");
     anoNasc = ler.nextInt();
    
     //considerando o ano atual(2022) menos 16
     //idade necessaria para votar
     if (anoNasc <= 2006){
     System.out.println("Voce podera votar esse ano.");
     }
     else {
     System.out.println("Voce nao podera votar esse ano.");
     }
   }   
}
