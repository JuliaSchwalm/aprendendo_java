package Lista7;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec3 {
    //Elabore um Método Tabuada que recebe um valor inteiro por parâmetro e
    //escreve a tabuada deste número. 

    public static void tabuadaEntrada(int num) {
        //mostrar tabuada
        for (int i = 1; i <= 10; i++) {
            int tabuada = num * i;
            System.out.println(tabuada);
        }
    }

    public static void main(String[] args) {
        //chamando o metod com parametro
        tabuadaEntrada(3);
    }
}
