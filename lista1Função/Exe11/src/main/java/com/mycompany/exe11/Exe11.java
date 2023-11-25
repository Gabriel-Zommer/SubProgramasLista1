/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe11;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Exe11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("qual o seu sexo? M ou F ");
        double altura = 1.75;
        char sexo = s.next().charAt(0);
       
        double pesoIdeal = calcularPesoIdeal(altura, sexo);
        
         System.out.println("O peso ideal é: " + pesoIdeal + " kg");
    }
    
    public static double calcularPesoIdeal(double altura, char sexo) {
        if (sexo == 'M'){
         return 72.7 * altura - 58;
    }else if (sexo == 'F'){
        return 62.1 * altura - 44.7;
    }else{
        return -1;
    }
    }
}
