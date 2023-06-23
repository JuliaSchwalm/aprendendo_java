package Lista5;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec6 {

    public static void main(String[] args) {
        int[] Z = new int[10];
        int[] W = new int[10];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("\nInsira 10 numeros[" + i + "] : ");
            Z[i] = ler.nextInt();
            W[i] = Z[i];
        }
        for (int i = 0; i < 110; i++) {
            Z[i] = W[i];
            System.out.println("W[" + i + "] = " + W[9 - i]);

        }

    }
}
