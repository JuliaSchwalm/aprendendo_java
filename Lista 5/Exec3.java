package Lista5;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int i, res = 0;

        for (i = 1; i < 500; i++) {
            if (i % 2 == 1 && i % 3 == 0) {
                res += i;
                System.out.println(res);
            }

        }
    }
}
