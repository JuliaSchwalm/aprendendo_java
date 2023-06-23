package Lista8;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec2 {

    /* Considerando a utilização de vetores, implemente um algoritmo que
    apresente ao usuário um menu, onde o mesmo irá apresentar as seguintes
    opções:
    (1) – Preencha o vetor;
    (2) – Imprima o conteúdo do vetor;
    (3) – Escreva um método que recebe um vetor de inteiros
    como parâmetro e devolve o índice do maior elemento
    do vetor;
    (4) – Escreva um método que recebe dois vetores de
    inteiros como parâmetro e devolve um valor booleano
    que diz se os dois vetores têm o mesmo tamanho;   */
    public static void opt(int opt) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[5];
        do {
            //pergunta qual opcao
            System.out.println("Digite o numero desejado para realizar a opcao."
                    + "(1)preenche o vetor;"
                    + "(2)imprime o vetor;"
                    + "(3)descubrir o maior numero do vetor;"
                    + "(4)dois vetores são do mesmo tamanho;"
                    + "(5)finalizar testes.");
            opt = ler.nextInt();

            //distribuindo as opcoes
            switch (opt) {
                //preenche o vetor
                case 1:
                    for (int i = 0; i < vetorA.length; i++) {
                        System.out.println("Preencha a posicao [" + i + "] do vetor:");
                        vetorA[i] = ler.nextInt();
                    }
                    break;
                //imprime o vetor
                case 2:
                    for (int i = 0; i < vetorA.length; i++) {
                        System.out.println("O vetor de [" + i + "] é:" + vetorA[i]);
                    }
                    break;
                //chama o metodo para saber o maior numero
                case 3:
                    maiorNum(vetorA);
                    break;
                //chama para saber se o tamanho do vetor B e C são iguais
                case 4:
                    mesmoTamanho(vetorB, vetorC);
                    break;
                //finaliza o laço de repetição
                case 5:
                    System.out.println("Testes finalizados");
                    break;
                default:
                    System.out.println("Opcao invalida");

            }

        } while (opt != 5);
    }

    public static void maiorNum(int[] vetorA) {
        int maiorNum = 0;
        //testa o maior elemento do vetor A
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > maiorNum) {
                maiorNum = vetorA[i];
            }
        }
        System.out.println("O maior numero do vetor eh:" + maiorNum);
    }

    public static void mesmoTamanho(int[] vetorB, int[] vetorC) {
        int i, j;
        //inicializando a variavel i, para saber o tamanho
        for (i = 0; i < vetorB.length; i++) {
        }
        //ininializando a variavel j, para saber o tamanho
        for (j = 0; j < vetorC.length; j++) {
        }
        //testando se é ou não do mesmo tamanho
        System.out.println(i == j);

    }

    public static void main(String[] args) {
        //chamando o metodo de opcoes para chamar outras funcoes e metodos
        opt(0);
    }
}
