package Lista9;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec6 {

    /* 6. Escreva um método Java que recebe a nota de um aluno como um double e
    a classifique e retorne um char de acordo com as seguintes regras:
    a. Maior ou igual a 9,00 - A
    b. Maior ou igual a 8,0 e menor que 9,0 - B
    c. Maior ou igual a 7,0 e menor que 8,0 - C
    d. Maior ou igual a 6,0 e menor que 7,0 - D
    e. Menor que 6,0 - E  */
    public static char conceitos(double nota) {
        char conceitos;
        if (nota >= 9.0) {
            conceitos = 'A';
        } else if (nota >= 8.0 && nota < 9.0) {
            conceitos = 'B';
        } else if (nota >= 7.0 && nota < 8.0) {
            conceitos = 'C';
        } else if (nota >= 6.0 && nota < 7.0) {
            conceitos = 'D';
        } else {
            conceitos = 'E';
        }
        return conceitos;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota:");
        nota = ler.nextDouble();

        System.out.println("O conteito eh:" + conceitos(nota));
    }
}
