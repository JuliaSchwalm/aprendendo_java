
package Lista3;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec9 {
      /**
     * 
     * @param args
     */
    /**Para A=5, B=3 e C= -2 responda se as seguintes expressões lógicas são V ou F. Utilize a linguagem
de programação JAVA para avaliar as sentenças
*/
   public static void main (String [] args){ 
    int A=5, B=3, C=-2;
    
       System.out.println(A>3 & B>5);
              System.out.println(! (A==5));
                     System.out.println(C==B-2 | ! (C>B & A<B) );
                            System.out.println(A>3 | B>5);
                                   System.out.println(A>B+C & C>-1 & B>3);

   }
}
