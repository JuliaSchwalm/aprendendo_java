
package Lista4;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec7 {
          /**
     * 
     * @param args
     */

   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
  
     double num1, num2, res=1;
     int operacao, i = 0;
   
       System.out.println("Digite um numero:");
       num1 = ler.nextDouble();
       
       System.out.println("Digite outro numero:");
       num2 = ler.nextDouble();
       
       System.out.println("Digite 1 se deseja somar; "
               + "2 se deseja subtrair; "
               + "3 se deseja multiplacar; "
               + "4 se deseja dividir; "
               + "e 5 para potenciação.");
        operacao = ler.nextInt();
    
        if (operacao == 5){
        while(i<num2){
             res = res*num1;
             i++;
         }
        } else{
     switch (operacao){
         case 1 -> res = num1 + num2;
         case 2 -> res = num1 - num2;
         case 3 -> res = num1 * num2;
         case 4 -> res = num1 / num2;
          default -> System.out.println("Operação não identificada.");
         }
        }
       System.out.println("O resultado da operação é:" + res);
   }
}
