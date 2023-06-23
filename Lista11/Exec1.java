package Lista11;

import java.util.Scanner;

/**
 *
 * @author Julia Schwalm Gomes
 */
public class Exec1 {

    public static int testeDeLetras(char[] palavraCorreta, char[] palavraTeste) {
        //teste de posicoes para saber se a letra esta na palavra do dia
        int acertos = 0;
        for (int i = 0; i < palavraTeste.length; i++) {
            boolean flag = false;
            for (int j = 0; j < palavraCorreta.length; j++) {
                if (j == i) {
                    //se forem iguais na mesma posicao
                    if (palavraCorreta[j] == palavraTeste[i]) {
                        System.out.println("A letra " + palavraTeste[i] + " esta na palavra na posicao certa.");
                        acertos++;
                        flag = true;
                        break;
                    }
                } else {
                    //senao esta na palavra na posicao errada
                    if (palavraCorreta[j] == palavraTeste[i]) {
                        System.out.println("A letra " + palavraTeste[i] + " esta na palavra, mas na posicao errada.");
                        flag = true;
                        break;
                    }
                }
            }
            //nao esta na palavra
            if (flag != true) {
                System.out.println("A letra " + palavraTeste[i] + " nao esta na palavra.");
            }
        }
        return acertos;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //declarando a palavra do dia e a variavel para receber a palavra do dia
        char[] palavraCorreta = new char[]{'s', 'u', 'r', 'f', 'e'};
        char[] palavraTeste = new char[5];
        int tentativas = 0, acertos = 0;

        do {
            //recebendo a palavra do dia do usuario 
            System.out.println("\nDigite a palavra do dia:\n");
            palavraTeste = ler.next().toCharArray();
            //a cada tentativa soma
            tentativas++;
            //chamando o metodo para testar as letras
            //acertos recebe o retorno
            acertos = testeDeLetras(palavraCorreta, palavraTeste);

        } while (tentativas < 6 && acertos != 5);

        if (acertos == 5) {
            System.out.println("\nParabens! Voce acertou a palavra do dia em " + tentativas + " tentativa.\n");
        } else {
            System.out.println("\nInfelizmente voce não encontrou a palavra em 6 tentativas.\n");
        }
    }
}
