
package Lista4;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec2 {
             /**
     * 
     * @param args
     */

   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
   
     double n1, n2, n3, n4, n5, resu1, resu2;
     
       System.out.println("Informe o primeiro numero:");
       n1 = ler.nextDouble();
     
       System.out.println("Informe o segundo numero:");
       n2 = ler.nextDouble();
       
       System.out.println("Informe o terceiro numero:");
       n3 = ler.nextDouble();
       
       System.out.println("Informe o quarto numero:");
       n4 = ler.nextDouble();
       
       System.out.println("Informe o quinto numero:");
       n5 = ler.nextDouble();
        
      resu1 = n4*n5;
      resu2 = n1+n2;
      
      if (resu1>resu2){
          System.out.println( resu1 + " e maior que " + resu2);
      } else{
          System.out.println( resu1 + " nao e maior " + resu2);
      }
   }
}
