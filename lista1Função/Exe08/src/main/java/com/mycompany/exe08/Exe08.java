/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe08;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Exe08 {
    public static void main(String[] args) {
        int numero = 7; // Substitua pelo valor desejado
        boolean resultado = verificarPositivoNegativo(numero);
        System.out.println("O número é positivo? " + resultado);
    }

    private static boolean verificarPositivoNegativo(int valor) {
        return valor >= 0;
    }
}
