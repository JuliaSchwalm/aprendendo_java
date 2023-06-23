package Lista5;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] C = new String[10];
        int i;
        String A;
        boolean contem = false;

        for (i = 0; i < 10; i++) {
            System.out.println("\nInsira 10 nomes[" + i + "] : ");
            C[i] = ler.next();
        }

        System.out.println("Digite um nome:");
        A = ler.next();

        for (i = 0; i < 10; i++) {
            if (C[i].equals(A)) {
                contem = true;
            }
        }

        if (contem == true) {
            System.out.println(" ACHEI");
        } else {
            System.out.println("NAO ACHEI");
        }
    }
}
