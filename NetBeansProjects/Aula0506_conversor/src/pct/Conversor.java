/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/** 
 *
 * @author cauadelgado
 */
public class Conversor {
    
    public static void main(String[] args) {
    
     //Declaração de Variaveis 
    double N1, N2, resul, op;
    
    
//    Entrada 
    Scanner entrada = new Scanner (System.in);
        
//    apresentação
      System.out.println("\n\t\t\t ---Conversor de Temperaturas---\n");
      
//      menu
        System.out.println(" [1] °C para °F ");
        System.out.println(" [2] °F para °C ");
        System.out.println(" [3] °C para K "); 
        System.out.println(" [4]  K para °C ");
        System.out.println(" [5] °F para K ");
        System.out.println(" [6]  K para °F ");

//        opção 
        System.out.print("\n Opção: \n");
        op = entrada.nextInt();

//     Entradas 
    if (op == 1) {
        System.out.print("\n\n Informe a temperatura (°C): ");
        N1 = entrada.nextDouble();
       
//      processamento
        resul = ( ( N1 * 9 ) / 5 ) + 32;
  
//      saida
        System.out.printf("\n\t\t temperatura(°F)= %.2f \n", resul);
    }      
       
    else if (op == 2){
//      entrada
        System.out.println("\n\n Informe a Temperatura (°F): ");
        N1 = entrada.nextDouble();
           
//       processamento
        resul = ( ( N1 - 32) * 5 ) / 9;
        
//        saida
        System.out.printf("\n\t\t temperatura(°C)= %.2f \n", resul);
    }
       
    else if (op == 3){
//      entrada
        System.out.println("\n\n Informe a temperatura (°C)");
        N1 = entrada.nextDouble();
           
//      processamento
        resul = N1 + 273.15; 
        
//      saida
        System.out.printf("\n\t\t teperatura(K)= %.2f \n", resul);
    }
        
    else if (op == 4){
//      entrada
        System.out.println("\n\n Informe a temperatura (K)");
        N1 = entrada.nextDouble();
           
//      processamento
        resul = N1 - 273.15;
        
//      saida
        System.out.printf("\n\t\t temperatura(°C)= %.2f \n", resul);
    }
       
    else if (op == 5){
//      entrada
        System.out.println("\n\n Informe a temperatura (°F)");
        N1 = entrada.nextDouble();
           
//      processamento
        resul = ( ( N1 + 459.67 ) / 1.8 );
           
//      saida
        System.out.printf("\n\t\t temperatura(K)= %.2f \n", resul);
    }
       
    else if (op == 6){
//      entrada
        System.out.println("\n\n Informe a temperatura (K)");
        N1 = entrada.nextDouble();
           
//      processamento
        resul = N1 * 1.8 - 459.67;
        
//      saida
        System.out.printf("\n\t\t temperatura(°F)= %.2f \n", resul);
           
    }
    
    else{
        System.out.println("opção " +op+ " Inválida! ");
    }
       
       
    }
}
