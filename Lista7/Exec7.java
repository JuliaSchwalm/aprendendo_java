package Lista7;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec7 {
    //  Elabore um Método Subtrair que recebe dois valores inteiros e retorna à
//subtração dos valores.

    public static void subtracao(int num1, int num2) {
        int subtracao = num1 - num2;
        System.out.println("A subtracao eh:" + subtracao);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro numero da subtracao:");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo numero da subtracao:");
        num2 = ler.nextInt();

        subtracao(num1, num2);
    }
}
