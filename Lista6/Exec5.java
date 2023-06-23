package Lista6;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec5 {

    /*  5. Faça um programa que receba a temperatura média de cada mês do ano e
    armazene-as em um vetor. Após isto, calcule a média anual das temperaturas
    e mostre todas as temperaturas acima da média anual e em que mês elas
    ocorreram. */
    public static void main(String[] args) {
        double[] temperatura = new double[12];
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        Scanner ler = new Scanner(System.in);
        double mediaAnual = 0;
        int aux = 0;

        //inserindo valores para o vetor
        for (int i = 0; i < 12; i++) {
            System.out.println("\nInsira a media de cada mes na ordem correta[" + i + "] : ");
            temperatura[i] = ler.nextDouble();
        }
        //calculando a media
        for (int i = 0; i < 12; i++) {
            mediaAnual += temperatura[i];
        }
        mediaAnual /= 12;
        System.out.println("A media anual é:" + mediaAnual);

        //meses que a temperatura ficou acima da media anual
        for (int i = 0; i < 12; i++) {
            if (temperatura[i] > mediaAnual) {
                System.out.println("No mes de " + meses[aux] + " a temperatura ficou acima da "
                        + "media com " + temperatura[i] + " graus.");
            }
            aux++;
        }

    }
}
