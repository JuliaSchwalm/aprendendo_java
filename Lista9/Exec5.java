package Lista9;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec5 {

    /*   Faça um método que receba três números inteiros e imprima-os em ordem
    crescente. */
    public static void crescente(int num1, int num2, int num3) {
        int aux;
        if (num1 > num2) {
            aux = num2;
            num2 = num1;
            num1 = aux;
        }
        if (num1 > num3) {
            aux = num3;
            num3 = num1;
            num1 = aux;
        }
        if (num2 > num3) {
            aux = num3;
            num3 = num2;
            num2 = aux;
        }
        System.out.println("A ordem crecente eh:" + num1 + "," + num2 + "," + num3 + ".");

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite o primeiro numero:");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = ler.nextInt();

        System.out.println("Digite o terceiro numero:");
        num3 = ler.nextInt();

        crescente(num1, num2, num3);
    }
}
