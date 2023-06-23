package Lista9;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec4 {

    /* Implemente um método DIVISORES, que recebe um valor inteiro e retorna à
    quantidade de divisores que este número tem.*/
    public static int divisores(int divi) {
        int cont = 0;
        for (int i = 1; i <= divi; i++) {
            //conta o numero de divisores
            if (divi % i == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int divi;
        System.out.println("Qual numero deseja saber a quantidade de divisores?");
        divi = ler.nextInt();
        //mostrando e chamando o metodo
        System.out.println("O numero de divisores eh:" + divisores(divi));
    }
}
