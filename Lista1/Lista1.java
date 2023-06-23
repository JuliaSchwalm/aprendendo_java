
package exec1;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Lista1 {

    /**
     * exercício 1 da lista 1
     * @param args
     */
    public static void main(String[] args) {      
      Scanner ler = new Scanner (System.in);
     
      float num, sgnum, soma;
      
      System.out.println("Informe um número:");
      num = ler.nextFloat();
      
      System.out.println("Informe outro número:");
      sgnum = ler.nextFloat();
      
      soma = num + sgnum;
      
       System.out.print("A soma dos dois números é:" + soma );
    }
    
}
