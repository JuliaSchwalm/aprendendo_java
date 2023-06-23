package Lista8;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec1 {

    /*    1. Implemente um algoritmo que simule uma calculadora. O programa deverá
    apresentar um menu ao usuário (na forma de método), o qual irá apresentar
    as seguintes opções:
    (1) – somar;
    (2) – subtração;
    (3) – multiplicação;
    (4) – divisão;
    (5) – sair;
    Para cada operação matemática, elabore um método que faça a resolução
    dos cálculos. Julgue, a seu critério, a utilização ou não de métodos com
    parâmetros ou com retorno de um tipo de dado em específico.*/
    public static void opt(int opt) {
        Scanner ler = new Scanner(System.in);
        double num1, num2;

        //recebendo os numeros 
        System.out.println("Digite o primeiro numero:");
        num1 = ler.nextDouble();

        System.out.println("Digite o segundo numero:");
        num2 = ler.nextDouble();

        do {
            //pergunta qual operação 
            System.out.println("Qual operacao você deseja realizar? Digite o numero desejado."
                    + "(1)para somar;"
                    + "(2)para subtrair;"
                    + "(3)para multiplicar;"
                    + "(4)para dividir;"
                    + "(5)para sair.");
            opt = ler.nextInt();

            //distribuindo as opcoes
            switch (opt) {
                case 1 ->
                    somar(num1, num2);
                case 2 ->
                    subtracao(num1, num2);
                case 3 ->
                    multiplicacao(num1, num2);
                case 4 ->
                    divisao(num1, num2);
                case 5 ->
                    System.out.println("Operações finalizadas.");
                default ->
                    System.out.println("Opcao invalida");

            }

        } while (opt != 5);
    }

    //metodo para somar
    public static void somar(double num1, double num2) {
        System.out.println("A soma dos numeros eh:" + (num1 + num2));
    }

    //metodo subtracao
    public static void subtracao(double num1, double num2) {
        System.out.println("A subtracao dos numeros eh:" + (num1 - num2));
    }
    //metodo multiplicacao

    public static void multiplicacao(double num1, double num2) {
        System.out.println("A multiplicacao dos numeros eh:" + (num1 * num2));
    }

    //metodo divisao
    public static void divisao(double num1, double num2) {
        System.out.println("A divisao dos numeros eh:" + (num1 / num2));
    }

    public static void main(String[] args) {
        opt(0);
    }

}
