/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe09;

/**
 *
 * @author Gabriel
 */
public class Exe09 {

    public static void main(String[] args) {
        int numero = 15;
        boolean resultado = verificarParImpar(numero);
        
        if (resultado) {
            System.out.println("O número é par.");
        }else {
            System.out.println("O número é ímpar.");
        }
    }
    
     private static boolean verificarParImpar(int valor) {
        return valor % 2 == 0;
    }
}
