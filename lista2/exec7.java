/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Júlia Schwalm Gomes
 */
public class exec7 {
    /**
     * 
     * @param args
     */
   public static void main (String [] args){
     Scanner ler = new Scanner (System.in);
     
       double nota1 , nota2, media;
      
      System.out.println("Informe a primeira nota:");
      nota1 = ler.nextDouble();
      
      System.out.println("Informe a segunda nota:");
      nota2 = ler.nextDouble();
      
      media = (nota1 + nota2)/2;
      System.out.println("Sua média é:" + media);
      
      if (media>=6.0) {
          System.out.println("Você foi aprovado!");
      }
          
   }  
}
