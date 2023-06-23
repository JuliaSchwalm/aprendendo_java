
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class exec11 {
  /**
     * 
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
     double senha;
     
     System.out.println("Escreva a senha:");
     senha = ler.nextDouble();
     
     //dois iguais utilizados para igualdade
     if (senha == 123 ){
     System.out.println("ACESSO PERMITIDO");
     }
     else {
     System.out.println("ACESSO NEGADO");
     }
   }   
}
