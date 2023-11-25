/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe01;

/**
 *
 * @author Gabriel
 */
public class Exe01 {

    public static void main(String[] args) {
        double raio = 3.0;
        double volume = calcularVolumeEsfera(raio);
        System.out.println("o volume da esfera com raio " + raio + " é: " + volume);
        
        
    }
    public static double calcularVolumeEsfera(double raio){
            double volume = (4.0/3.0)*Math.PI*Math.pow(raio, 3);
            return volume;
        }
}
