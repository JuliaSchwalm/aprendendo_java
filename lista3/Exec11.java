package Lista3;

import java.util.Scanner;

/**
 *
 * @author Julia Schwalm Gomes
 */
public class Exec11 {
            /**
     * 
     * @param args
     */
    /**A jornada de trabalho semanal de Carlos é de 40 horas. Caso ele trabalhe mais de 40 horas, receberá
hora extra, cujo valor é o valor da hora regular com um acréscimo de 50 %. Escreva um algoritmo
que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do
funcionário (considere que o mês possua 4 semanas exatas).
* */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in); 
     
       double valorHora, salario, salarioExtra;
       int numHoras;
      
       //lendo o numero de horas
      System.out.println("Informe o numero de horas trabalhadas esse mes:");
      numHoras = ler.nextInt();
     
      //lendo o valor da hora
      System.out.println("Informe o valor da hora trabalhada:");
      valorHora = ler.nextDouble();
      
      //salario basico 
      salario = 160 * valorHora;
              
      //se trabalhou mais de 160 horas(o normal) entra no if
      if (numHoras>160){
       //calculo do numero de hora extra
       numHoras = numHoras - 160;
       //calculo do valor da hora extra
       valorHora = valorHora + (valorHora*1/2);
       //calculo do valor recebido por todas as horas extras
       salarioExtra= numHoras * valorHora;
       System.out.println("Seu salario do mes foi de " + (salario + salarioExtra )+ "reais.");
      }
      else{
      System.out.println("Seu salario do mes foi:" + salario +"reais");
      }
      }
    }
