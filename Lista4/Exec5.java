
package Lista4;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec5 {
     /**
     * 
     * @param args
     */

   public static void main (String [] args){
   Scanner ler = new Scanner (System.in); 
   
     double compra;
     int num;
        //valor da compra
       System.out.println("Digite o valor da compra:");
       compra = ler.nextDouble();
       //definir o numero para saber se vai ter desconto
       System.out.println("Digite 1 se voce é apenas cliente;"
               + "Digite 2 se voce é funcionario;"
               + "Digite 3 se voce é cliente vip.");
       num = ler.nextInt(); 
       //definindo os descontos
       switch (num) {
           case 3:
               System.out.println("Sua compra com 5% de desconto ficou:" + (compra-(compra*0.05)));
               break;
           case 2:
               System.out.println("Sua compra com 10% de desconto ficou:" + (compra-(compra*0.10)));
               break;
           case 1:
               System.out.println("Sua compra ficou:" + compra);
               break;
           default:
               System.out.println("Numero não identicado.");
               break;
       }
   
   }
   }
