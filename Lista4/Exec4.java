
package Lista4;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec4 {
               /**
     * 
     * @param args
     */

   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
   
     int num;
     
       System.out.println("Informe um numero de 1 a 12:");
       num = ler.nextInt();
       
       switch (num){
           case 1:
               System.out.println("Janeiro");
               break;
           case 2:
               System.out.println("Fevereiro");
               break;
           case 3:
               System.out.println("Março");
               break;
           case 4:
               System.out.println("Abril");
               break;
           case 5:
               System.out.println("Maio");
               break;
           case 6:
               System.out.println("Junho");
               break;
           case 7:
               System.out.println("Julho");
               break;
           case 8:
               System.out.println("Agosto");
               break;
           case 9:
               System.out.println("Setembroo");
               break;
           case 10:
               System.out.println("Outubro");
               break;
           case 11:
               System.out.println("Novembro");
               break;
           case 12:
               System.out.println("Dezembro");
               break;               
           default:
               System.out.println("Mes nao identificado");
       }
       }                 
}
