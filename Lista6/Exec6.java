package Lista6;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec6 {

    /*   Faça um Programa que leia um vetor de 10 caracteres e, após isso, diga
    quantas consoantes foram lidas. Por fim, imprima as consoantes presentes
    no respectivo Vetor. */
    public static void main(String[] args) {
        char[] letras = new char[10];
        Scanner ler = new Scanner(System.in);
        int aux = 0, acumulador = 0;

        //inserindo valores para o vetor
        for (int i = 0; i < 10; i++) {
            System.out.println("\nInsira 10 caracteres[" + i + "] : ");
            letras[i] = ler.next().charAt(0);
        }
        //somando o numero de consoantes
        for (int i = 0; i < 10; i++) {
            if (letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
                aux = 1;
                acumulador += aux;
            }
        }
        System.out.println("No total foram digitadas: " + acumulador + " consoantes.");

        //mostrando as consoantes digitadas
        for (int i = 0; i < 10; i++) {
            if (letras[i] != 'a' && letras[i] != 'e' && letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
                System.out.println("O caractere da posição[" + i + "] é a consoante:" + letras[i]);
            }
        }
    }
}
