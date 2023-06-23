package Lista7;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec6 {
    //Elabore um Método Soma que recebe dois valores inteiros e retorna a soma
//dos valores.

    public static void soma(int num1, int num2) {
        int soma = num1 + num2;
        System.out.println("A soma eh:"+soma);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro numero da soma:");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo numero da soma:");
        num2 = ler.nextInt();

        soma(num1, num2);
    }
}
