package Lista7;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec2 {
    //Elabore um Método TabuadaOito que imprime a tabuada do número 8. 

    public static void tabuadaOito(int tabuada) {
        //mostrar tabuada
        for (int i = 1; i <= 10; i++) {
            tabuada = 8 * i;
            System.out.println(tabuada);
        }
    }

    public static void main(String[] args) {
        tabuadaOito(0);
    }
}
