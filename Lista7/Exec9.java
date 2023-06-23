package Lista7;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec9 {
    //Elabore um Método VerificaPar, que recebe um valor inteiro e retorna um
//valor logico verdadeiro caso o número seja par e falso caso contrário. 

    public static void verificarPar(int num) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero para saber se é par ou não");
        num = ler.nextInt();

        if (num % 2 == 0) {
            System.out.println(num % 2 == 0);
        } else {
            System.out.println(num % 2 == 0);
        }
    }

    public static void main(String[] args) {
        verificarPar(0);
    }
}
