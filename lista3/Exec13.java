package Lista3;

import java.util.Scanner;

/**
 *
 * @author Julia Schwalm Gomes
 */
public class Exec13 {
            /**
     * 
     * @param args
     */
    /**Elabore um algoritmo que, dada a idade de um nadador, classifique-o em uma das seguintes
categorias:
Infantil A: 5 a 7 anos
Infantil B: 8 a 10 anos
Juvenil A: 11 a 13 anos
Juvenil B: 14 a 17 anos
Sênior: maiores de 18 anos.
* */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
       int idade;
       
    
   do{
      System.out.println("Informe a sua idade:");
      idade = ler.nextInt();
     //distribuindo por categoria
      if (idade>=5 & idade<=7){
       System.out.println("Sua categoria e: Infantil A." );
      }
      else if (idade>=8 & idade<=10){
       System.out.println("Sua categoria e: Infantil B." );
      }
      else if (idade>=11 & idade<=13){
       System.out.println("Sua categoria e: Juvenil A." );          
      }
      else if (idade>=14 & idade<=17){
       System.out.println("Sua categoria e: Juvenil B." );
      } 
       else if (idade==39){
       System.out.println("Voce esta no limite de idade para continuar competindo. Sua categoria e: Senior." );          
      }
       else if (idade>=18 & idade<40) {
       System.out.println("Sua categoria e: Senior." );          
      }
      
   }while(idade<40);
   System.out.println("Atleta com idade superior a idade máxima permitida no Clube João Machado de Natação");
   }
}
    