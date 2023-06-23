package Lista9;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec3 {

    /*   3. Leia o nome e a altura de cada aluno de uma turma de 10 alunos. Ao final,
    mostre o nome e a altura do aluno mais alto e nome+altura do aluno mais
    baixo. */
    public static void nomeAltura(String[] vetorNome, double[] vetorAltura) {
        Scanner ler = new Scanner(System.in);
        int maiorAltura = 0, menorAltura = 0;
        //laço para receber nomes     
        for (int i = 0; i < vetorNome.length; i++) {
            System.out.println("Digite o nome numero [" + i + "]:");
            vetorNome[i] = ler.next();
        }
        //laco para receber alturas
        for (int j = 0; j < vetorAltura.length; j++) {
            System.out.println("Digite o nome numero [" + j + "]:");
            vetorAltura[j] = ler.nextDouble();
        }
        //laco para fazer os testes
        for (int j = 0; j < vetorNome.length; j++) {
            //teste de maior altura
            if (vetorAltura[j] > vetorAltura[maiorAltura]) {
                maiorAltura = j;
            }
            //teste de menor altura
            if (vetorAltura[j] < vetorAltura[menorAltura]) {
                menorAltura = j;
            }
        }
        //mostrando resultados
        System.out.println("O aluno " + vetorNome[maiorAltura] + " é o mais alto com " + vetorAltura[maiorAltura] + "cm.");
        System.out.println("O aluno " + vetorNome[menorAltura] + " é o mais baixo com " + vetorAltura[menorAltura] + "cm.");
    }

    public static void main(String[] args) {
        String[] vetorNome = new String[10];
        double[] vetorAltura = new double[10];

        nomeAltura(vetorNome, vetorAltura);

    }
}
