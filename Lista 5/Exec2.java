package Lista5;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num, res;

        System.out.println("Digite um numero:");
        num = ler.nextDouble();

        if (num > 0) {
            res = num + num;
            System.out.println("O dobro do numero é:" + res);
        } else {
            res = num + num + num;
            System.out.println("O triplo do numero é:" + res);
        }
    }
}
