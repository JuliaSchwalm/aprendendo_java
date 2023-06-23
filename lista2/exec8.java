package Lista2;

import java.util.Scanner;

/**
 *
 * @author JÃºlia Schwalm Gomes
 */
public class exec8 {
    /**
     * 
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in);
     
       double nota1 , nota2, media;
      
      System.out.println("Informe a primeira nota:");
      nota1 = ler.nextDouble();
      
      System.out.println("Informe a segunda nota:");
      nota2 = ler.nextDouble();
      
      media = (nota1 + nota2)/2;
      System.out.println("Sua media e:" + media);
      
      if (media>=6.0) {
          System.out.println("Voce foi aprovado!");
      }
      else{ 
          System.out.println("Voce foi reprovado!");
    } 
   }
}
