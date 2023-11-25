/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe03;

/**
 *
 * @author Gabriel
 */
public class Exe03 {

    public static void main(String[] args) {
        int numero =  9;
        
         if (valorInteiro(numero)) {
            System.out.println(numero + "v");
        } else {
            System.out.println(numero + "f");
        }
    }
    public static boolean valorInteiro(int numero){
        if(numero <= 1){
            return false;
        }else if (numero <= 3) {
            return true;
        }else  if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        
         for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
          return true;
    }
}
