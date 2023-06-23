
package aula2_9fev;

import java.util.Scanner;

/**
 *
 * @author Julia Schwalm Gomes
 */
public class exec2 {

    /**
     * exerci­cio 2 da lista 1
     * @param args
     */
    public static void main(String[] args) {      
      Scanner ler = new Scanner (System.in);
     
      float num, sgnum, tercnum;
      
      System.out.println("Informe um numero:");
      num = ler.nextFloat();
      
      System.out.println("Informe outro numero:");
      sgnum = ler.nextFloat();
      
      System.out.println("Informe mais um numero:");
      tercnum = ler.nextFloat();
         
       System.out.print("A media dos tres numeros e:" + (num + sgnum + tercnum)/3 );
    }
    
}
