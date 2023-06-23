package Lista5;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec9 {

    public static void main(String[] args) {
        int[] x = new int[11];
        int[] y = new int[11];
        int[] r = new int[20];
        Scanner ler = new Scanner(System.in);
        int aux = 1;

        for (int i = 1; i < 11; i++) {
            System.out.println("\nInsira 10 numeros para Y[" + i + "] : ");
            y[i] = ler.nextInt();
        }

        for (int i = 1; i < 11; i++) {
            System.out.println("\nInsira 10 numeros para X[" + i + "] : ");
            x[i] = ler.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            r[i] = y[aux];
            i++;
            r[i] = x[aux];
            aux++;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("R[" + i + "] = " + r[i]);
        }
    }
}
