/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe06;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Exe06 {

    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        System.out.println("digite sua idade: ");    
        int idade = s.nextInt();
        int diasDoAno = 365;
        int mes = 12;
        int resultado = funcao(diasDoAno, idade);
        
        System.out.println(" Idade " + idade);
        System.out.println(" Mês " + mes * idade);
        System.out.println(" Dias " + resultado);
    }
    
    public static int funcao ( int a, int b){
        
        int resultadoDiasDoAno = a * b;
        return resultadoDiasDoAno;
    }
}
