package Lista5;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec5 {

    public static void main(String[] args) {
        int[] B = new int[10];
        Scanner ler = new Scanner(System.in);
        int i = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("\nInsira 10 numeros[" + i + "] : ");
            B[i] = ler.nextInt();

            if (B[i] % 2 == 0) {
                B[i] = 0;
            } else {
                B[i] = 1;
            }
        }
        for (i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
