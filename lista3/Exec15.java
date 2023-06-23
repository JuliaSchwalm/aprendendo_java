
package Lista3;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec15 {
              /**
     * 
     * @param args
     */
    /**Usando a Estrutura de repetição do-while, leia um valor inteiro do teclado que irá continuar a
ser executado, enquanto o valor digitado for diferente de 0. Para cada número que o usuário
digitar, calcule o valor de 2^(número digitado) e, em seguida, imprima o resultado obtido. Ex:
Usuário digitou o número 5, o programa irá calcular 2^5 = 32. Resultado: 2^5 = 32
* */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
       int num;
          
   do{
      System.out.println("Informe um numero:");
      num = ler.nextInt();
      double resultado = Math. pow(2, num) ;
      //mostrando o resultado
      System.out.println("Numero na base 2:" + resultado);     
   }while(num!=0);
   }  
}
