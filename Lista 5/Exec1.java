package Lista5;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec1 {

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x = 0, y = 0;

        System.out.println("Digite o y para saber.");
        y = ler.nextInt();

        System.out.println("Digite o x para saber.");
        x = ler.nextInt();

        System.out.println(y == x);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x != y);
    }
}
