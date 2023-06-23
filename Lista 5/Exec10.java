package Lista5;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec10 {

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner ler = new Scanner(System.in);
        int num = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nInsira 5 numeros para A[" + i + "] : ");
            a[i] = ler.nextInt();
        }

        System.out.println("Digite 1 para A[]*5 e 2 para A[]-10");
        num = ler.nextInt();

        switch (num) {
            case 1:
                int[] b = new int[5];
                for (int i = 0; i < 5; i++) {
                    b[i] = a[i] * 5;
                    System.out.println("b[" + i + "] = " + b[i]);
                }
                break;

            case 2:
                int[] c = new int[5];
                for (int i = 0; i < 5; i++) {
                    c[i] = a[i] - 10;
                    System.out.println("c[" + i + "] = " + c[i]);
                }
                break;
            default:
                System.out.println("Opcao invalida");

        }
    }
}
