
package Lista4;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec1 {
             /**
     * 
     * @param args
     */

   public static void main (String [] args){
     Scanner ler = new Scanner (System.in);  
 //valor atribuido conforme a tabela   
     char A = 2, B = 5, C = 2, D = 3, E = 4;
     char F = 2, G = 3, H = 4, I = 4, J = 3, S = 0;
     int conta = 0, compra;
 //exibindo os valores e produtos
       System.out.println("A-Alface:2,00");
       System.out.println("B-Batata:5,00");
       System.out.println("C-Cenoura:2,00");
       System.out.println("D-Couve-flor:3,00");
       System.out.println("E-Beterraba:4,00");
       System.out.println("F-Tempero verde:2,00");
       System.out.println("G-Brocolis:3,00");
       System.out.println("H-Repolho:4,00");
       System.out.println("I-Tomate:4,00");
       System.out.println("J-Pepino:3,00");
     
     do{
     System.out.print("Digite a letra do produto que voce quer comprar:");
     compra = ler.next().charAt(0);
     
              switch (compra){
        case 'A' -> compra = A;
         case 'B' -> compra = B;
         case 'C' -> compra = C;
        case 'D' -> compra = D;
        case 'E' -> compra = E;
        case 'F' -> compra = F;
        case 'G' -> compra = G;
        case 'H' -> compra = H;
        case 'I' -> compra = I;
        case 'J' -> compra = J;
        case 'S' -> compra = S;
           default -> System.out.println("Esse produto nao tem na feira.");
              }
      //soma a conta
      conta = conta + compra;  
      //mostra o valor da compra a cada item
         System.out.println("Seus produtos ja somaram "+ conta + " reais"); 
   
   } while(conta<20); 
    
     //quando o valor passa de 20, a ultima letra selecionada é excluida
    if (conta>20){
    conta = conta-compra;
     System.out.println("Sua compra foi " + conta +" reais.");
    }   
    else{
         System.out.println("Sua compra foi " + conta +" reais.");
    }
    
   }
}
