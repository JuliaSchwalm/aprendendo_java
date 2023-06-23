package Lista7;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class Exec4 {
    //Elabore um Método EscreveValor que recebe um valor inteiro por parâmetro
    //(entre 0 e 10) e escreve o valor por extenso. 

    public static void escreveValor(int num) {
        //precisa ser inicializada
        String numExtenso = "";
        //definindo o nome de cada numero
        switch (num) {
            case 0 ->
                numExtenso = "zero";
            case 1 ->
                numExtenso = "um";
            case 2 ->
                numExtenso = "dois";
            case 3 ->
                numExtenso = "tres";
            case 4 ->
                numExtenso = "quatro";
            case 5 ->
                numExtenso = "cinco";
            case 6 ->
                numExtenso = "seis";
            case 7 ->
                numExtenso = "sete";
            case 8 ->
                numExtenso = "oito";
            case 9 ->
                numExtenso = "nove";
            case 10 ->
                numExtenso = "dez";

            default ->
                System.out.println("Numero invalido");
        }
        System.out.println(numExtenso);

    }

    public static void main(String[] args) {
        escreveValor(10);
    }
}
