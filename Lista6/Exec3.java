package Lista6;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec3 {

    public static void main(String[] args) {
        double[] salarios = new double[10];
        double[] reajuste = new double[10];
        String[] nome = new String[10];
        Scanner ler = new Scanner(System.in);
        int aux = 0, aux2 = 0;
        double porcentagem, acumulador, valorReajuste;

        //inserindo valores para o vetor
        for (int i = 0; i < 10; i++) {
            System.out.println("\nInsira os nomes dos funcionarios de TADS2_LP1[" + i + "] : ");
            nome[i] = ler.next();
        }
        
        //inserindo valores para o vetor
        for (int i = 0; i < 10; i++) {
            System.out.println("\nInsira os 10 salarios dos funcionarios[" + i + "] : ");
            salarios[i] = ler.nextDouble();
        }
        
        //lendo valor do reajuste
        System.out.println("Digite a porcentagem do reajuste:");
        valorReajuste = ler.nextDouble();
        
        //calculando o reajuste
        for (int i = 0; i < 10; i++) {
            //porcentagem do reajuste
            porcentagem = valorReajuste / 100;
            //acumulador para o valor do reajuste
            acumulador = salarios[aux] * porcentagem;
            //salario somado ao reajuste
            reajuste[i] = acumulador + salarios[i];
            aux++;
        }
        
        // definindo o salario de cada um 
        for (int i = 0; i < 10; i++) {
            System.out.println("\nO novo salario do(a) " + nome[aux2] + " é de: "
                    + reajuste[i] + " reais.");
            aux2++;
        }
    }
}
