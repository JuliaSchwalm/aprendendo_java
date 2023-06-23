package Lista7;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec1 {
    // Elabore um Método MeuNome que escreve 10 vezes o seu nome na tela. 

    //criando o metodo void pois é apenas mostrar o parametro
    public static void meuNome(String nome) {
        //mostra 10 vezes o metodo 
        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        //chamando o metodo com parametro
        meuNome("Júlia");
    }
}
