/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetopa1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProjetoPA1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
    //Leitura
    Scanner leia = new Scanner (System.in);
        
     //Entrada de dados   
     int valor;
     int vdesconto;
     int pdesconto;
     int vjuros;
     int pjuros;
     
     //Entrada de dados manual//
     System.out.println("****WINKS!****");
     System.out.println("Digite o valor da compra");
     valor = leia.nextInt(); //Fazer a leitura do valor
     System.out.println("Digite a porcentagem de desconto:");
     pdesconto = leia.nextInt(); //Fazer a leitura do desconto
     System.out.println("Digite a porcentagem de juros");
     pjuros =leia.nextInt(); //Fazer a leitura do desconto
     
     //Processamento
     vdesconto = valor * pdesconto; //Calculo de desconto
     vjuros = valor * pjuros; //Calculo de juros
     
     //Saida
     System
    System.out.println("Compra com" +);
    System.out.println("Compra com 10% d juros" + vjuros);
    }
}
