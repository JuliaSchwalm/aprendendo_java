package Lista3;

import java.util.Scanner;

/**
 *
 * @author JÃºlia Schwalm Gomes
 */
public class Exec3 {
        /**
     * 
     * @param args
     */
    /**Acrescente uma mensagem de ‘VALOR INVÁLIDO’ no exercício 1, caso o segundo valor informado
seja ZERO.
* */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
       double num1 = 0 , num2 = 0;
      
      System.out.println("Informe o primeiro numero:");
      num1 = ler.nextDouble();
      
      do {
      System.out.println ("Informe o segundo numero:");
      num2 = ler.nextDouble();
      if (num2==0){
       System.out.println("VALOR INVALIDO");
      }
      }while (num2 == 0);
      System.out.println ("A divisao dos numeros informados eh:" + (num1/num2));
   }
}

