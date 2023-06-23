
package Lista4;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec3 {
               /**
     * 
     * @param args
     * 
     */

   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
   
         double n1, n2, n3, n4, aux;
          int esco;
          
       System.out.println("Informe o primeiro numero:");
       n1 = ler.nextDouble();
     
       System.out.println("Informe o segundo numero:");
       n2 = ler.nextDouble();
       
       System.out.println("Informe o terceiro numero:");
       n3 = ler.nextDouble();
       
       System.out.println("Informe o quarto numero:");
       n4 = ler.nextDouble();
       //escolher o tipo de ordem
       System.out.println("Digite 1 para ordem crescente e 2 para decrescente.");
       esco = ler.nextInt();
       //alinhar os numeros em ordem crescente
       if (n1>n2){
       aux = n1;
       n1 = n2;
       n2 = aux;
       }
       if (n1>n3){
           aux=n1;
           n1=n3;
           n3=aux;
       }
       if (n1>n4){
           aux=n1;
           n1=n4;
           n4=aux;
       }
       if (n2>n3){
       aux = n2;
       n2= n3;
       n3=aux;
   }  
       if (n2>n4){
           aux=n2;
           n2=n4;
           n4=aux;
       }
       if (n3>n4){
           aux=n3;
           n3=n4;
           n4=aux;
       }
       if (esco == 1){
       System.out.println("Crescente:" + n1 + n2 + n3 + n4);
       } else {
       System.out.println("Decrescente:" + n4 + n3 + n2 + n1);
       }
       }
}
