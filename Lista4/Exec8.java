
package Lista4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec8 {
            /**
     * 
     * @param args
     */

   public static void main (String [] args){
       Scanner ler = new Scanner (System.in); 
   Random random = new Random();
   int numRandom = random.nextInt(10)+10;
   int num;
   
    do{
       System.out.println("Digite um de 10 a 19 para tentar adivinhar");
       num = ler.nextInt();
      
       if (num>numRandom){
           System.out.println("Menos, bem menos.");
       } else if(num<numRandom){
           System.out.println("Daqui de cima nao te vejo.");
       } else{
           System.out.println("Parabéns! Voce acertou.");
       }
       
       } while (num != numRandom);
   }
   }  
