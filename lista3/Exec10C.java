
package Lista3;

import java.util.Scanner;

/**
 *
 * @author JÃºlia Schwalm Gomes
 */
public class Exec10C {
            /**
     * 
     * @param args
     */
    /**Escreva um algoritmo para ler um valor e imprimir qual o tipo de faixa ele se encontra (cheia
ou tracejada). -Considere os limites dentro da linha cheia.
* */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
       double num;
      
      System.out.println("Informe o numero:");
      num = ler.nextDouble();
      //considerando os numeros mostrando os limites da linha cheia
      if (num>=-5 & num<=10 | num>=25){
       System.out.println("Esta na linha cheia.");
      }
      else{
      System.out.println("Esta na linha tracejada.");
      }
      }
    }
