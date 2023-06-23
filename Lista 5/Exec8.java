package Lista5;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec8 {

    public static void main(String[] args) {
        int[] r = new int[5];
        int[] s = new int[10];
        int[] x = new int[15];
        Scanner ler = new Scanner(System.in);
        int aux = 5;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nInsira 5 numeros para R[" + i + "] : ");
            r[i] = ler.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("\nInsira 10 numeros para S[" + i + "] : ");
            s[i] = ler.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            x[i] = r[i];
        }
        for (int i = 0; i < 10; i++) {
            x[aux] = s[i];
            aux++;
        }

        for (int i = 0; i < 15; i++) {
            System.out.println("X[" + i + "] = " + x[i]);
        }

    }
}
