package Lista6;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec2 {

    /*. Leia 5 nomes e 5 notas de uma turma. Após isso, calcule e exibe a média das
    notas da turma e em seguida, exiba a relação de nomes cuja nota é superior
    à média 6.0.*/
    public static void main(String[] args) {
        double[] nota = new double[5];
        String[] nome = new String[5];
        Scanner ler = new Scanner(System.in);
        double acumulador = 0;
        int aux = 0;
        //inserindo valores para o vetor
        for (int i = 0; i < 5; i++) {
            System.out.println("\nInsira 5 nomes para os alunos[" + i + "] : ");
            nome[i] = ler.next();
        }
        //inserindo valores para o vetor
        for (int i = 0; i < 5; i++) {
            System.out.println("\nInsira 5 notas para os alunos[" + i + "] : ");
            nota[i] = ler.nextDouble();
        }
        //somando todas as notas
        for (int i = 0; i < 5; i++) {
            acumulador += nota[i];
        }
        //calculando a media das notas
        acumulador = acumulador / 5;
        System.out.println("\nA média de notas da turma eh:" + acumulador);
        //definindo quem ficou com mais de 6 e mostrando na tela
        for (int i = 0; i < 5; i++) {
            if (nota[i] >= 6) {
                System.out.println("\nO aluno(a) " + nome[aux] + " alcancou a media "
                        + "com nota:" + nota[i]);
            }
            aux++;
        }
    }
}
