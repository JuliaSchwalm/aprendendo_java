package Lista5;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char opc = 0;
        double saldo = 0, deposito = 0, valorSaque = 0;
        //  int a, b, c, d;

        do {
            System.out.println("O voce deseja?"
                    + "(a) consulta saldo"
                    + "(b) saque "
                    + "(c) depósito"
                    + "(d) sair");
            opc = ler.next().charAt(0);

            switch (opc) {
                case 'a':
                    System.out.println("Seu saldo eh:" + saldo);
                    break;
                case 'b':
                    System.out.println("Quanto deseja sacar?");
                    valorSaque = ler.nextDouble();
                    saldo = saldo - valorSaque;
                    break;
                case 'c':
                    System.out.println("Quanto deseja depositar?");
                    deposito = ler.nextDouble();
                    saldo = saldo + deposito;
                    break;
                case 'd':
                    opc = 1;
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        } while (opc != 1);

    }
}
