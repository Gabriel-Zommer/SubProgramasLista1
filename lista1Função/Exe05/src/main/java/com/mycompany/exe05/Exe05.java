/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe05;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Exe05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("escreva os segundos: ");
        double segundosDeclarados = s.nextDouble();
        double segundos = 60;
        
        double resultadosEmMinutos = tempoFabrica(segundosDeclarados, segundos);
        double resultadosEmHoras = tempoFabrica(segundos, resultadosEmMinutos);
        System.out.println("resultados da conversão de: " + segundosDeclarados + " segundos para minutos é: " + resultadosEmMinutos + " e em horas: " +
                resultadosEmHoras);
    }
    
    public static double tempoFabrica(double a, double b){
        double divisoriaMin = a / b;
        
        
        return divisoriaMin;
    }
}
