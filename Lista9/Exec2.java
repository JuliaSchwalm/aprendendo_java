package Lista9;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec2 {

    /*    Faça um procedimento que gera os 10 primeiros primos acima de 100 e
    retorna-os em um vetor X(10), por parâmetro.*/
    public static int divisores(int divi) {
        int cont = 0;

        for (int i = 1; i <= divi; i++) {
            //conta o numero de divisores
            if (divi % i == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static int[] Vetor(int[] vetorX) {
        int divi = 100;
        int j = 0;
        //laco para preencher o vetor e chamar o metodo
        for (int i = 0; i < vetorX.length; i++) {
            //testa se tiver mais de um divisor, eh poque nao eh primo
            if (divisores(divi) > 2) {
                //se nao eh primo incrementa o numero para saber o numero de divisores
                divi++;
                //chama o metodo novamente
                divisores(divi);
                //decrementa para seguir o laço
                i--;
            } else {
                //preenche o vetor na posicao j, que recebe divi
                vetorX[j] = divi;
                //incrementa o j para a proxima posicao ser preenchida
                j++;
                //incrementa a divi para para chamar o metodo com proximo numero
                divi++;
                divisores(divi);
            }
        }
        return vetorX;
    }

    public static void main(String[] args) {
        int[] vetorX = new int[10];
        Vetor(vetorX);
        for (int i = 0; i < vetorX.length; i++) {
            System.out.println("Os numeros primos são:" + vetorX[i]);
        }
    }
}
