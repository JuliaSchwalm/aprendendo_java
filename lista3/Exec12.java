package Lista3;

import java.util.Scanner;

/**
 *
 * @author Julia Schwalm Gomes
 */
public class Exec12 {
            /**
     * 
     * @param args
     */
    /**Escreva um algoritmo que receba a média de aproveitamento de um aluno (em números) após
converta a nota numérica para conceito seguindo a tabela abaixo:
* */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
       double media;
      //lendo a media do aluno
      System.out.println("Informe a sua media:");
      media = ler.nextDouble();
     //distribuindo conceiitos
      if (media>=9.0){
       System.out.println("Seu conceito e: A." );
      }
      else if (media>=7.5 & media<9.0){
       System.out.println("Seu conceito e: B." );
      }
      else if (media>=6.0 & media<7.5){
       System.out.println("Seu conceito e: C." );          
      }
      else {
       System.out.println("Seu conceito e: D." );          
      }
   }
}
    
